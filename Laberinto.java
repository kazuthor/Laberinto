import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Laberinto
{
    
    public Punto entrada;
 
    private List<Punto> puntos;
    private Punto salida1;
    private Punto salida2;
    private Punto salida3;
    private Personaje personaje;
    private List<Evento> eventos;
    private Temporizador temporizador;
    
    public Laberinto() {
        eventos = new ArrayList<>();
    }
    
     public Laberinto(Punto entrada, Punto salida1, Punto salida2, Punto salida3) {
        this.entrada = entrada;
        this.salida1 = salida1;
        this.salida2 = salida2;
        this.salida3 = salida3;
        eventos = new ArrayList<>();
    }
    
     public void agregarEvento(Evento evento) {
        eventos.add(evento);
    }

    public void eliminarEvento(Evento evento) {
        eventos.remove(evento);
    }

    public List<Evento> getEventos() {
        return eventos;
    }

     public Punto getEntrada() {
        return entrada;
        }

    public void setEntrada(Punto entrada) {
        this.entrada = entrada;
    }

    public Punto getSalida1() {
        return salida1;
    }

    public void setSalida1(Punto salida1) {
        this.salida1 = salida1;
    }

    public Punto getSalida2() {
        return salida2;
    }

    public void setSalida2(Punto salida2) {
        this.salida2 = salida2;
    }

    public Punto getSalida3() {
        return salida3;
    }

    public void setSalida3(Punto salida3) {
        this.salida3 = salida3;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    public Temporizador getTemporizador() {
        return temporizador;
    }

    public void setTemporizador(Temporizador temporizador) {
        this.temporizador = temporizador;
    }
    
    
 public void verMapa() {
    System.out.println("Mostrando mapa del laberinto...");
    if (salida1 != null) {
        System.out.println("Salida 1 - Coordenadas: X=" + salida1.getCoordenadax() + ", Y=" + salida1.getCoordenaday());
    }
    if (salida2 != null) {
        System.out.println("Salida 2 - Coordenadas: X=" + salida2.getCoordenadax() + ", Y=" + salida2.getCoordenaday());
    }
    if (salida3 != null) {
        System.out.println("Salida 3 - Coordenadas: X=" + salida3.getCoordenadax() + ", Y=" + salida3.getCoordenaday());
    }
}

public void start() {
        System.out.println("Iniciando juego...");
        // Lógica para iniciar el juego
    }

public void reiniciar() {
        System.out.println("Reiniciando juego...");
        // Lógica para reiniciar el juego
    }

public void end() {
        System.out.println("Juego terminado. ¡Gracias por jugar!");
        // Lógica para finalizar el juego
    }

}
