package Reto3.Principal;

import Reto1.Salud.Persona;
import Reto3.Salud.Empleado;

public class Inicio {
    public static void main(String[] args) {
        Empleado datos = new Empleado();
        // Persona.pedirDatos();

        datos.calcularHonorarios("ti",543534234,"thomas", "castro", 2000, 70);
    }
}
