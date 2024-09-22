package ufps.vista;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VerEstudiante extends javax.swing.JFrame {
    
    public JButton btnAgregar = null;
    public JButton btnCancelar = null;
    public JButton btnMostrar = null;
    
    public JTextField txtNombre = null;
    public JTextField txtApellido = null;
    public JTextField txtCodigo = null;
    public JTextField txtDireccion = null;
    public JTextField txtTelefono = null;
    
    public JLabel lblNombre = null;
    public JLabel lblApellido = null;
    public JLabel lblCodigo = null;
    public JLabel lblDireccion = null;
    public JLabel lblTelefono = null;
    
    public JTextArea areaMostrar = null;
    
    Container contenedor = null;

    public VerEstudiante() {
        this.setSize(320, 380);
        this.setTitle("Registro de Estudiantes");
        this.setLayout(new FlowLayout());

        contenedor = getContentPane();

        // Inicialización de etiquetas y campos de texto
        lblCodigo = new JLabel("Código:");
        txtCodigo = new JTextField("", 20);
        
        lblNombre = new JLabel("Nombre:");
        txtNombre = new JTextField("", 20);
        
        lblApellido = new JLabel("Apellido:");
        txtApellido = new JTextField("", 20);
        
        lblDireccion = new JLabel("Dirección:");
        txtDireccion = new JTextField("", 20);
        
        lblTelefono = new JLabel("Teléfono:");
        txtTelefono = new JTextField("", 20);

        // Inicialización de área de texto para mostrar información
        areaMostrar = new JTextArea(5, 24);
        areaMostrar.setEditable(false);

        // Inicialización de botones
        btnAgregar = new JButton("Agregar");
        btnCancelar = new JButton("Cancelar");
        btnMostrar = new JButton("Mostrar");

        // Añadir componentes al contenedor
        contenedor.add(lblCodigo);
        contenedor.add(txtCodigo);
        contenedor.add(lblNombre);
        contenedor.add(txtNombre);
        contenedor.add(lblApellido);
        contenedor.add(txtApellido);
        contenedor.add(lblDireccion);
        contenedor.add(txtDireccion);
        contenedor.add(lblTelefono);
        contenedor.add(txtTelefono);
        contenedor.add(btnAgregar);
        contenedor.add(btnCancelar);
        contenedor.add(btnMostrar);
        contenedor.add(areaMostrar);

        this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
