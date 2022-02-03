/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio_extra_06;
import Entidades.Ahorcado;
import Servicios.ServiciosAhorcado;
import java.util.Arrays;
public class Ejercicio_extra_06 {

    
    public static void main(String[] args) {
        ServiciosAhorcado saho = new ServiciosAhorcado();
        Ahorcado b;
        b = saho.crearJuego();
        
        saho.juego(b);
        
    }

}
