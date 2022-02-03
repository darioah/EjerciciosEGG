package ejercicio_05;

import Entidades.Cuenta;


public class Ejercicio_05 {

    
    public static void main(String[] args) {
        
        Cuenta c = new Cuenta();
        c.crearCuenta();
        
        c.retirar(6000);
        c.consultarSaldo();
        c.extraccionRapida();
        c.consultarDatos();
        
    }

}
