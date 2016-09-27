
package edu.ulima.java;


public class Alumno {
    
    private String Codigo;   
    private String Nombre;   
    private String Apellido;
    private int pc1;
    private int pc2;
    private int pc3;
    private int TA;    
    private int EF;
    private int EP;
    private int NotaFinal;

    public Alumno() {
    }

    public Alumno(String Codigo, String Nombre, String Apellido, int pc1, int pc2, int pc3, int TA, int EF, int EP, int NotaFinal) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.pc1 = pc1;
        this.pc2 = pc2;
        this.pc3 = pc3;
        this.TA = TA;
        this.EF = EF;
        this.EP = EP;
        this.NotaFinal = NotaFinal;
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

    public int getPc1() {
        return pc1;
    }

    public void setPc1(int pc1) {
        this.pc1 = pc1;
    }

    public int getPc2() {
        return pc2;
    }

    public void setPc2(int pc2) {
        this.pc2 = pc2;
    }

    public int getPc3() {
        return pc3;
    }

    public void setPc3(int pc3) {
        this.pc3 = pc3;
    }

    public int getTA() {
        return TA;
    }

    public void setTA(int TA) {
        this.TA = TA;
    }

    public int getEF() {
        return EF;
    }

    public void setEF(int EF) {
        this.EF = EF;
    }

    public int getEP() {
        return EP;
    }

    public void setEP(int EP) {
        this.EP = EP;
    }

    public int getNotaFinal() {
        return NotaFinal;
    }

    public void setNotaFinal(int NotaFinal) {
        this.NotaFinal = NotaFinal;
    }

    @Override
    public String toString() {
        return "Alumno{" + "Codigo=" + Codigo + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", pc1=" + pc1 + ", pc2=" + pc2 + ", pc3=" + pc3 + ", TA=" + TA + ", EF=" + EF + ", EP=" + EP + ", NotaFinal=" + NotaFinal + '}';
    }

    
    
    
    
}
