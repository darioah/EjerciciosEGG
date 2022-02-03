/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafetera;


/**
 * @author Jose Luis
 * @version 1.0
 */
/*
La clase Nespresso, hereda de Cafetera y sirve Capsulas de Cafe
*/
public class Nespresso extends Cafetera{
    private double cafePorCapsula;

    //getters y setters
    public double getCafePorCapsula() {
        return cafePorCapsula;
    }

    public void setCafePorCapsula(double cafePorCapsula) {
        this.cafePorCapsula = cafePorCapsula;
    }
    
    //constructor, que recibe la capacidad Maxima y la cantidad de Cafe de capsula
    public Nespresso(int capacidadMaxima, int cafePorCapsula) {
      
 
    }
    
    
    
      public double servirCapsula(int cantidadActual) throws IllegalArgumentException {
          
         if (cafePorCapsula > cantidadActual){
             System.err.println("No se puede servir una cantidad de cafe por capsula superior al cafe actual");
         }else
         cantidadActual -= cafePorCapsula;
         //la cantidad actual menos la capsula servida, sera el resultado de cantidadActual
         return cantidadActual;
    }    
    }
    

