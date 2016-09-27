
package edu.ulima.metodo;

import edu.ulima.java.Alumno;
import edu.ulima.java.Profesor;
import java.util.List;


public class Registrar {
    
    
   public void HallarTA(Alumno a){
       
       int promedio;
       int pc1 = a.getPc1();
       int pc2 = a.getPc2();
       int pc3 = a.getPc3();
       
       promedio=(pc1+pc2+pc3)/3;
       
       a.setTA(promedio);
       
   }
   
   public void HallarNotaFinal(Alumno a){
   
       int promedio;
       int TA = a.getTA();
       int EP = a.getEP();
       int EF = a.getEF();
       
       promedio=(TA+EP+EF)/3;
   
       a.setNotaFinal(promedio);
   }
   
   

   
   
    
}
