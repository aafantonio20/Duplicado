
package edu.ulima.main;

import edu.ulima.java.Alumno;

import edu.ulima.metodo.Datos;
import edu.ulima.metodo.Registrar;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        Datos d = new Datos();
        Registrar r = new Registrar();
        
        List<Alumno> la = d.ingresarDatosAlum();
     
        for (Alumno alumno : la) {
            System.out.println(alumno);
        }
        
        for (Alumno alumno : la) {
            r.HallarTA(alumno);
            r.HallarNotaFinal(alumno);
        }
        
        System.out.println("=========================");
        for (Alumno alumno : la) {
            System.out.println(alumno);
        }
        
        
        
        //Muestra la lista de los Alumnos
        
    

        
    }
    
}
