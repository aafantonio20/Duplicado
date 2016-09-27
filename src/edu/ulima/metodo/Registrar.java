
package edu.ulima.metodo;

import edu.ulima.java.Alumno;

import java.util.List;


public class Registrar {
    
    public void HallarTA(Alumno a){
       int promedio;
       promedio = HallamarProm(a.getPc1(), a.getPc2(), a.getPc3());
       a.setTA(promedio);
       
   }
   
   public void HallarNotaFinal(Alumno a){
       int promedio;
       promedio = HallamarProm(a.getTA(),a.getEP(),a.getEF());
       a.setNotaFinal(promedio);
   }
   
   
   public int HallamarProm(int num1,int num2,int num3){
       int prom;
       prom=(num1+num2+num3)/3;
       return prom;
   }
   

   
   
    
}
