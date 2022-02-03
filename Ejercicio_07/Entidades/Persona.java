package Entidades;

import java.util.Scanner;


public class Persona {
    private String nombre;
    private String sexo;
    private float peso;
    private float altura;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, String sexo, float peso, float altura, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void crearPersona(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el nombre de la persona");
        this.setNombre(leer.next());
        System.out.println("Ingrese la edad de la persona");
        this.setEdad(leer.nextInt());
        
        System.out.println("Ingrese el sexo de la persona (H)ombre, (M)ujer, (O)tro");
        this.setSexo(leer.next());
        if(!this.getSexo().toUpperCase().equals("H") && !this.getSexo().toUpperCase().equals("M") && !this.getSexo().toUpperCase().equals("O")){
            System.out.println("Sexo incorrecto");
            this.setSexo("");
        }
        System.out.println("Ingrese Altura de la persona en centimetros");
        this.setAltura(leer.nextFloat());
        System.out.println("Ingrese el peso de la persona en Kg");
        this.setPeso(leer.nextFloat());
    }
    
    public int calcularMC(){
        
        if(this.getPeso()/(Math.pow(this.getAltura()/100, 2))<20){
            return -1;
        }else if(this.getPeso()/(Math.pow(this.getAltura()/100, 2))<=25){
            return 0;
        }
        return 1;
    }
    
    public boolean esMayordeEdad(){
        return this.getEdad()>17;
    }
    
}
