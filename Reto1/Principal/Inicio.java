package Reto1.Principal;

import Reto1.Salud.Persona;

public class Inicio {
    public static void main(String[] args) {
        Persona usuario = new Persona();
        usuario.pedirDatos();
        usuario.mostrarPersona();
        usuario.calcularImc();
        usuario.mayorEdad();
    }
}
