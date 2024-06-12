

public class Personaje
{
    public boolean tieneCasco;
    public boolean tieneChaleco;
    public boolean tieneLinterna;
    public int nivelVida;
    public Punto salida1;
    public Punto salida2;
    public Punto salida3;
    private Laberinto laberinto;
    
    public boolean getTieneCasco(){
        return tieneCasco;
    }
    
    public boolean getTieneChaleco(){
        return tieneChaleco;
    }
    
    public boolean getTieneLinterna(){
        return tieneLinterna;
    }

    public int getNivelVida () {
        return nivelVida;
    }
    
    public Laberinto getLaberinto(){
        return laberinto;
    }
    
    public void setTieneCasco(boolean tieneCasco){
        this.tieneCasco = tieneCasco;
    }
    
    public void setTieneChaleco(boolean tieneChaleco){
        this.tieneChaleco = tieneChaleco;
    }
    
    public void setTieneLinterna(boolean tieneLinterna){
        this.tieneLinterna = tieneLinterna;
    }
    
    public void setNivelVida(int nivelVida){
        this.nivelVida = nivelVida;
    }
    
    public void setLaberinto(Laberinto laberinto){
        this.laberinto = laberinto;
    }
    
     public Punto getSalida1() {
        return salida1;
    }

    public Punto getSalida2() {
        return salida2;
    }

    public Punto getSalida3() {
        return salida3;
    }

    
    public Personaje()
    {
        
    }
    
     public Personaje(boolean tieneCasco, boolean tieneChaleco, boolean tieneLinterna, int nivelVida, Punto salida1, Punto salida2, Punto salida3) {
        this.tieneCasco = tieneCasco;
        this.tieneChaleco = tieneChaleco;
        this.tieneLinterna = tieneLinterna;
        this.nivelVida = nivelVida;
        this.salida1 = salida1;
        this.salida2 = salida2;
        this.salida3 = salida3;
    }
    

    public void buscarSalida (int numeroSalida){
    
        Punto salidaSeleccionada = null;
        switch(numeroSalida){
            case 1:
                salidaSeleccionada = salida1;
                break;
                
            case 2:
                salidaSeleccionada = salida2;
                break;
                
            case 3:
                salidaSeleccionada = salida3;
                break;
                
            default:
                break;
            }
            
        if(salidaSeleccionada != null){
            
            float x =salidaSeleccionada.getCoordenadax();
            float y =salidaSeleccionada.getCoordenaday();
        }
        }
        
    public void recorrerMina(){
    }
    
    public void recogerMineral(){
    }
    
}
