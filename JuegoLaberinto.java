
public class JuegoLaberinto {
private Laberinto laberinto;
    private boolean juegoEnCurso;

    public JuegoLaberinto() {
        laberinto = new Laberinto();
        juegoEnCurso = false;
    }

    public void iniciarJuego() {
        laberinto = new Laberinto(new Punto(0, 0), new Punto(1, 1), new Punto(2, 2), new Punto(3, 3));
        System.out.println("Iniciando juego...");
        juegoEnCurso = true;
        while (juegoEnCurso) {
            // Lógica principal del juego
        }
        System.out.println("Juego terminado. ¡Gracias por jugar!");
    }

    public void terminarJuego() {
        juegoEnCurso = false;
    }

    public static void main(String[] args) {
        JuegoLaberinto juego = new JuegoLaberinto();
        juego.iniciarJuego();
    }
}
