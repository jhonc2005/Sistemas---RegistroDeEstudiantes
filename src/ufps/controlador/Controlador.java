package ufps.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import ufps.modelo.Estudiante;
import ufps.vista.VerEstudiante;

public class Controlador implements ActionListener {
    private ArrayList<Estudiante> estudiantes;
    private VerEstudiante verEstudiante;

    public Controlador(Estudiante estudiante, VerEstudiante verEstudiante) {
        this.estudiantes = new ArrayList<>();
        this.verEstudiante = verEstudiante;

        // Registrar los botones
        this.verEstudiante.btnAgregar.addActionListener(this);
        this.verEstudiante.btnCancelar.addActionListener(this);
        this.verEstudiante.btnMostrar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        try {
            if (evento.getSource() == this.verEstudiante.btnAgregar) {
                // Obtener los datos de los campos de texto
                String codigo = this.verEstudiante.txtCodigo.getText();
                String nombre = this.verEstudiante.txtNombre.getText();
                String apellido = this.verEstudiante.txtApellido.getText();
                String direccion = this.verEstudiante.txtDireccion.getText();
                String telefono = this.verEstudiante.txtTelefono.getText();

                // Crear nuevo estudiante
                Estudiante nuevoEstudiante = new Estudiante(codigo, nombre, apellido, direccion, telefono);
                estudiantes.add(nuevoEstudiante); // Añadir a la lista
                
                // Limpiar los campos
                this.verEstudiante.txtCodigo.setText("");
                this.verEstudiante.txtNombre.setText("");
                this.verEstudiante.txtApellido.setText("");
                this.verEstudiante.txtDireccion.setText("");
                this.verEstudiante.txtTelefono.setText("");

            } else if (evento.getSource() == this.verEstudiante.btnCancelar) {
                // Limpiar los campos de texto
                this.verEstudiante.txtCodigo.setText("");
                this.verEstudiante.txtNombre.setText("");
                this.verEstudiante.txtApellido.setText("");
                this.verEstudiante.txtDireccion.setText("");
                this.verEstudiante.txtTelefono.setText("");

            } else if (evento.getSource() == this.verEstudiante.btnMostrar) {
                // Mostrar la lista de estudiantes
                StringBuilder infoEstudiantes = new StringBuilder();
                for (Estudiante est : estudiantes) {
                    infoEstudiantes.append(est.nombreCompleto()).append("\n");
                }
                this.verEstudiante.areaMostrar.setText(infoEstudiantes.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
