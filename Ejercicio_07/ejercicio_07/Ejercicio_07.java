/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio_07;

import Entidades.Persona;


public class Ejercicio_07 {

    
    public static void main(String[] args) {
        int cantmuestras = 4;
        Persona vec[] = new Persona[cantmuestras];
        float por_sobrep=0, por_debpes=0, por_pesideal=0, mayrs=0;
        for(int i=0; i<cantmuestras;i++){
            vec[i] = new Persona();
            vec[i].crearPersona();
            if(vec[i].calcularMC()<0){
                por_debpes++;
            }else if(vec[i].calcularMC()<1){
                por_pesideal++;
            }else{
                por_sobrep++;
            }
            if(vec[i].esMayordeEdad()){
                mayrs++;
            }
        }
        
        System.out.println("Personas debajo del peso ideal: %"+por_debpes*100/cantmuestras);
        System.out.println("Personas dentro del peso ideal: %"+por_pesideal*100/cantmuestras);
        System.out.println("Personas con sobrepeso: %"+por_sobrep*100/cantmuestras);
        
        System.out.println("Mayores de edad: %"+(mayrs*100/cantmuestras));
        System.out.println("Menores de edad: %"+(100-mayrs*100/cantmuestras));
    }

}
