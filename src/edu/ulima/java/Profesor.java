
package edu.ulima.java;


public class Profesor {
    
    private String Codigo;
    private String Nombre;
    private String Apellido;
    private String Correo;

    public Profesor() {
    }

    public Profesor(String codigoProf, String Nombre, String Apellido, String Correo) {
        this.Codigo = codigoProf;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Correo = Correo;
    }
    

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    @Override
    public String toString() {
        return "Profesor{" + "codigoProf=" + Codigo + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Correo=" + Correo + '}';
    }
    
    
}
