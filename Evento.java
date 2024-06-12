

public class Evento
{
    public String descripcion;
      private Laberinto laberinto;

    
    public String getDescripcion(){
        return descripcion;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    
    public Laberinto getLaberinto(){
        return laberinto;
    }
    
    public void setLaberinto(Laberinto laberinto){
        this.laberinto = laberinto;
    }
    
    public Evento()
    {
        
    }
    
    public Evento(String descripcion,Laberinto laberinto)
    {
        this.descripcion = descripcion;
        this.laberinto = laberinto;
    }

    
    public void iniciar()
    {
        System.out.println("el evento inicio");
    }
    
    public void terminar()
    {
        System.out.println("el termino");
    }
}
