
package ufps.modelo;

public class Estudiante {
    private String codigo;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;

    // Constructor

    public Estudiante() {
        super();
    }
    
    
    
    public Estudiante(String codigo, String nombre, String apellido, String direccion, String telefono) {
        super();
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // Métodos getters y setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Método para devolver el nombre completo
    public String nombreCompleto() {
        return this.nombre + " " + this.apellido;
    }
}