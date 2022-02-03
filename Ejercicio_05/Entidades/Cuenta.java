package Entidades;

import java.util.Scanner;


public class Cuenta {
    private int numeroCuenta;
    private long DNI;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long DNI, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void crearCuenta(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el dni del propietario");
        this.setDNI(leer.nextLong());
        System.out.println("Ingrese numero de la cuenta");
        this.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese el saldo de la cuenta");
        this.setSaldo(leer.nextDouble());
        
    }
    
    public void ingresar(double ingreso){
        
        this.setSaldo(this.getSaldo()+ingreso);
    }
    
    public void retirar(double retiro){
        
        this.setSaldo(this.getSaldo()-retiro);
        if(this.getSaldo()<0){
            this.setSaldo(0);
        }
    }
    
    public void extraccionRapida(){
        
        this.setSaldo(this.getSaldo()*0.8);
    }
    
    public void consultarSaldo(){
        System.out.println("Saldo: $"+this.getSaldo());
    }
    
    public void consultarDatos(){
        System.out.println("DNI propietario: "+this.getDNI());
        System.out.println("Cuenta "+this.getNumeroCuenta());
        System.out.println("Saldo: $"+this.getSaldo());
    }
}
