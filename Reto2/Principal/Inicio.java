package Reto2.Principal;

import Reto2.Salud.Persona;
import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        Scanner capturar = new Scanner(System.in);
        Persona usuario2 = new Persona();
        usuario2.pedirDatos();
        usuario2.mostrarPersona();
        usuario2.mayorEdad();

        String resultadoImc = usuario2.calcularImc();

        if (resultadoImc.equals("PESOBAJO")) {
            System.out.println("PESO BAJO");
        } else if (resultadoImc.equals("PESOIDEAL")) {
            System.out.println("PESO IDEAL");
        } else if (resultadoImc.equals("SOBREPESO")) {
            System.out.println("SOBREPESO");
        }
    }
}
