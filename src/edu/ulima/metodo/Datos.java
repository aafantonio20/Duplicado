
package edu.ulima.metodo;

import edu.ulima.java.Alumno;

import java.util.ArrayList;
import java.util.List;


public class Datos {
    
    public List<Alumno> ingresarDatosAlum(){
    
        List<Alumno> alu = new ArrayList<>();
            Alumno a0 = new Alumno("100","nom0","ape0",12,14,16,0,14,14,0);
            Alumno a1 = new Alumno("101","nom1","ape1",12,14,16,0,16,16,0);
            Alumno a2 = new Alumno("102","nom2","ape2",12,14,16,0,10,14,0);
            alu.add(a0);
            alu.add(a1);
            alu.add(a2);
       
        return alu;
    
    }
}
