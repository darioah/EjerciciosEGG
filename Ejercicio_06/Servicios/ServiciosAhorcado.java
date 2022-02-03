package Servicios;

import java.util.Scanner;
import Entidades.Ahorcado;

public class ServiciosAhorcado {

    public ServiciosAhorcado() {
    }
    
    public Ahorcado crearJuego(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la palabra a adivinar");
        String palabra = leer.next();
       
        int longitud = palabra.length();
        
        String vec[] = new String[palabra.length()];
        this.insertarenvector(vec, palabra);
        
        System.out.println("Ingrese cantidad jugadas maximas");
        int intentos = leer.nextInt();
        
        Ahorcado n = new Ahorcado(0,intentos,longitud,vec);
        return n;
    }
    
    public void insertarenvector(String[] destino, String fuente){
        for(int i=1; i<destino.length;i++){
            destino[i-1] = fuente.substring(i-1,i);
        }
        destino[destino.length-1] = fuente.substring(destino.length-1);
    }
    
    public int Longitud(Ahorcado n){
        return n.getLongitud();
    }
    
    public void buscar(Ahorcado n, String letra){
        String vec[] = new String[n.getPalabraABuscar().length];
        System.arraycopy(n.getPalabraABuscar(), 0, vec, 0, n.getPalabraABuscar().length);
        boolean init = false;
        for(int i=0;i<n.getLongitud();i++){
            if(vec[i].equals(letra)){
                System.out.println("La palabra contiene la letra "+letra);
                n.setCantidadEncontradas(n.getCantidadEncontradas()+1);
                vec[i] = ".";
                init=true;
            }
        }
        n.setPalabraABuscar(vec);
        if(!init){
            System.out.println("La palabra no contiene la letra "+letra);
            n.setCantidadJugadasMaximas(n.getCantidadJugadasMaximas()-1);
        }
        
    }
    
//    public void encontradas(Ahorcado n, String letra){
//        this.buscar(n, letra);
//    }
    
    public void intentos(Ahorcado n){
        System.out.println("Encontradas / Intentos Restantes : "+n.getCantidadEncontradas()+" / "+n.getCantidadJugadasMaximas());
    }
    
    public void juego(Ahorcado n){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        do{
            System.out.println("Ingrese una letra");
            this.buscar(n,leer.next());
            this.intentos(n);
            System.out.println("Longitud de la palabra: "+n.getLongitud());
            System.out.println("-----------------");
        }while(n.getCantidadJugadasMaximas()>0 && n.getCantidadEncontradas()<n.getLongitud());
        if(n.getCantidadEncontradas()==n.getLongitud()){
            System.out.println("Felicidades has descubierto la palabra");
        }else{
            System.out.println("Te has quedado sin intentos");
        }
    }
    
}
