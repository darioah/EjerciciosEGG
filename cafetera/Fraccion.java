/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafetera;

import java.util.Scanner;

/**
 *
 * @author Jose Luis
 * @version 1.0
 */
public class Fraccion {
    
    int numerador;
    int denominador;

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
   
    
    //recibe el numerador y el denominador
    public Fraccion(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
        
    
    }
    //obtiene el numerador y el demoninador y le da un valor
    public double modifica() throws IllegalArgumentException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor introduce el numerador");
         numerador = sc.nextInt();
         System.out.println("Por favor introduce el denominador");
         denominador = sc.nextInt();
        return numerador;
        
    }
    /*
    * Multiplica el numerador y el denominador, por otra fracción en la que meteremos
    * el denominador y numerador tambien
    */
    
    public void multiplica( Fraccion f){
        this.numerador=numerador;
         this.denominador=denominador;
         numerador = numerador * f.getNumerador();
         denominador = denominador * f.getDenominador();
        
        
    }
    
    //recibe otra fraccion y la devuelve una representación de ella
    public static void caracteres(String[] args) {
        int numerador;
        int denominador;
    Scanner sc = new Scanner(System.in);
        System.out.println("Por favor introduce el numerador");
         numerador = sc.nextInt();
         System.out.println("Por favor introduce el denominador");
         denominador = sc.nextInt();
        
         System.out.println("La fraccion representada es " + numerador*2 +"/"+denominador*2);
    
    }} 

    