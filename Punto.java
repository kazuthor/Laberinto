

public class Punto
{
    
    public float coordenadaX,coordenadaY;
    
    public float getCoordenadax(){
        return coordenadaX;
    }
    
    public float getCoordenaday(){
        return coordenadaY;
    }
    
    public void setCoordenadax(float coordenadaX){
        this.coordenadaX = coordenadaX;
    }
    
    public void setCoordenaday(float coordenadaY){
        this.coordenadaY = coordenadaY;
    }
    
    public Punto()
    {
        
    }
    
    public Punto(float coordenadadX,float coordenadaY)
    {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    
    
}
