/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafetera;

/**
 *
 * @author Jose Luis
 * @version 1.0
 */

/*
 * La clase Cafetera, organizara el funcionamiento de una cafetera, llenando, vaciando
    agregando, o sirviendo el café
 * 
 */
public class Cafetera {

    private int capacidadMaxima;
    private int cantidadActual;
    int taza;
    int relleno;
    

    
    /**
    *se aplican los Getters y Setters
    *
    */
    
    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    //se empiezan a declarar los constructores
    
    //se establece la capacidad maxima en 1000 y se inicializa la cantidad actual
    public Cafetera (){
        capacidadMaxima = 1000;
        cantidadActual = 0;
    }

    //llena la cafetera a la capacidad maxima
        public Cafetera (int capacidadMaxima) {
        cantidadActual = capacidadMaxima;
        
    }


    //contiene la capacidad maxima y la actual, si la actual es superior, la ajusta al maximo
    public Cafetera (int capacidadMaxima, int cantidadActual)
    {
        this.capacidadMaxima = capacidadMaxima;
       
        this.cantidadActual = (cantidadActual > capacidadMaxima) ? capacidadMaxima :
                                                                   cantidadActual;
    /*usamos el operador condicional para que si la cantidad actual supera a la maxima
    *la cantidad maxima, sea la actual (adopta el valor)
    */
    }
    
    
    
    
    
    

    //empezamos a declarar los metodos
    public double llenarCafetera(){
        cantidadActual=capacidadMaxima;
        //la cantidad actual, es llenada a su capacidadMaxima
        return cantidadActual; 
    }
    
     public void servirTaza(int taza){
         

       
         
         if (taza > cantidadActual){
            
             vaciarCafetera();
         }else
         cantidadActual -= taza;
         //la cantidad actual menos la taza servida, sera el resultado de cantidadActual
        
        
    }
     
     public double vaciarCafetera(){
        cantidadActual=0;
        return cantidadActual;
        
    }
     
     public double agregarCafe(int relleno){
         
         cantidadActual += relleno;
         // se le añade a cantidadActual, la cantidad introducida
        return cantidadActual;
        
    }
 
}
