package Entidades;


public final class Ahorcado {
    
    private int cantidadEncontradas;
    private int cantidadJugadasMaximas;
    private int longitud;
    private String palabraABuscar[];

    public Ahorcado() {
        this.palabraABuscar = new String[longitud];
    }

    public Ahorcado( Integer cantidadEncontradas, Integer cantidadJugadasMaximas, Integer longitud, String[] palabraABuscar) {
        this.palabraABuscar = new String[longitud];
        
        this.cantidadEncontradas = cantidadEncontradas;
        this.cantidadJugadasMaximas = cantidadJugadasMaximas;
        this.longitud = longitud;
        this.setPalabraABuscar(palabraABuscar);
    }

    public int getCantidadEncontradas() {
        return cantidadEncontradas;
    }

    public void setCantidadEncontradas(int cantidadEncontradas) {
        this.cantidadEncontradas = cantidadEncontradas;
    }

    public int getCantidadJugadasMaximas() {
        return cantidadJugadasMaximas;
    }

    public void setCantidadJugadasMaximas(int cantidadJugadasMaximas) {
        this.cantidadJugadasMaximas = cantidadJugadasMaximas;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String[] getPalabraABuscar() {
        return palabraABuscar;
    }

    public void setPalabraABuscar(String[] palabraABuscar) {
        
        System.arraycopy(palabraABuscar, 0, this.palabraABuscar, 0, palabraABuscar.length);
    }
    
    

    
    
    
    
}
