package Reto2.Salud;
import java.util.Scanner;

public class Persona {
    //SE DECLARAN LOS ATRIBUTOS
    private static String tipoDoc;
    private static int documento;
    private static String nombre;
    private static String apellido;
    private static double peso;
    private static double estatura;
    private static int edad;
    private static String sexo;

    //SE DECLARAN LOS METODOS

    public static void pedirDatos(){
        Scanner capturar= new Scanner(System.in);
        System.out.print("Tipo de documento: ");
        tipoDoc = capturar.nextLine();
        System.out.print("Numero Documento: ");
        documento = capturar.nextInt();
        capturar.nextLine();
        System.out.print("Nombre: ");
        nombre = capturar.nextLine();
        System.out.print("Apellido: ");
        apellido = capturar.nextLine();
        System.out.print("Peso: ");
        peso = capturar.nextDouble();
        System.out.print("Estatura: ");
        estatura = capturar.nextDouble();
        System.out.print("Edad: ");
        edad = capturar.nextInt();
        capturar.nextLine();
        System.out.print("Sexo (M) o (F): ");
        sexo = capturar.nextLine();
        System.out.println("---------------------------------------------------");

    }

    public static void mostrarPersona(){
 
        System.out.println("Tipo de documento: " + tipoDoc);
        System.out.println("Numero Documento: " + documento);
        System.out.println("Nombre: "+ nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Peso: " + peso);
        System.out.println("Estatura: " + estatura);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo (M) o (F): " + sexo);
        System.out.println("---------------------------------------------------");
        
    }

    
    public static String calcularImc(){
        double imc = peso / (estatura * estatura);
        if (imc < 20) {
            return "PESOBAJO";
        } else if (imc >= 20 && imc <= 25) {
            return "PESOIDEAL";
        } else {
            return "SOBREPESO";
        }
    }
    

    public static void mayorEdad(){
        if (edad>0 & edad<=3){
            System.out.println("Es un bebe");
        }else if (edad>3 & edad<=15){
            System.out.println("Es un niño");
        }else if (edad>15 & edad<=19){
            System.out.println("Es un Adolescente");
        }else if (edad>19 & edad<=29){
            System.out.println("Es un Joven");
        }else if (edad>29 & edad<=60){
            System.out.println("Es un adulto");
        }else if (edad>60){
            System.out.println("Es un adulto mayor");
        }

        System.out.println("---------------------------------------------------");
    }
}
