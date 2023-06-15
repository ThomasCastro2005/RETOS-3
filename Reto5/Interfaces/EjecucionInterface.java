package Reto5.Interfaces;

public class EjecucionInterface {
    public static void main(String[] args) {
        Caraysello caraysello = new Caraysello();
        Ppt juego = new Ppt();
        caraysello.iniciar();
        caraysello.jugar();
        caraysello.finalizar();

        juego.iniciar();
        juego.jugar();
        juego.finalizar();

    }

}
