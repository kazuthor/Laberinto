

public class Temporizador
{
   
    public float limiteTiempo;
    private Laberinto laberinto;
    
    public float getLimiteTiempo(){
        return limiteTiempo;
    }
    
    public void setLimiteTiempo(float limiteTiempo){
        this.limiteTiempo = limiteTiempo;
    }
    
    public Laberinto getLaberinto(){
        return laberinto;
    }
    
    public void setLaberinto(Laberinto laberinto){
        this.laberinto = laberinto;
    }
    
    public Temporizador()
    {
        
    }

    public Temporizador(float limiteTiempo,Laberinto laberinto)
    {
        this.limiteTiempo = limiteTiempo;
        this.laberinto = laberinto;
    }
    
    public void contarTiempo()
    {
         float tiempoRestante = limiteTiempo;
        long tiempoInicio = System.currentTimeMillis();

        while (tiempoRestante > 0) {
            long tiempoActual = System.currentTimeMillis();
            float tiempoTranscurrido = (tiempoActual - tiempoInicio) / 1000.0f;
            tiempoRestante = limiteTiempo - tiempoTranscurrido;

            if (tiempoRestante <= 0) {
                
                
                break; // Salir del bucle si el tiempo restante es menor o igual a cero
            }

            // Mostrar el tiempo restante cada segundo
            if ((int) tiempoTranscurrido % 1 == 0) {
                System.out.println("Tiempo restante: " + tiempoRestante + " segundos");
            }
        }

        System.out.println("Límite de tiempo alcanzado. Juego terminado.");
    }
}

