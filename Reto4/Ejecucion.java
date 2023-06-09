package Reto4;
import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        Cilindro calcularCilindro = new Cilindro();
        Trapecio calcularTrapecio = new Trapecio();
        Triangulo calcularTriangulo = new Triangulo();
        Rombo calcularRombo = new Rombo();

        Scanner capturar = new Scanner(System.in);
        String respuesta;
        int opcion1;
        int seleccion;

        do {
            System.out.println("------------------------------------------------");
            System.out.println("BIENVENIDO AL PROGRAMA DE CALCULA TU FIGURA");
            System.out.println("------------------------------------------------");
            System.out.print(" 1- Calcular Area \n 2- Calcular Perimetro \n Que calculo quiere realizar: ");
            opcion1 = capturar.nextInt();

            if (opcion1 == 1){
                System.out.println("------------------------------------------------");
                System.out.print(" 1- Cilindro \n 2- Rombo \n 3- Trapecio \n 4- Triangulo \n 5- Salir\nIngrese la figura que desea calcular: ");
                seleccion = capturar.nextInt();
                boolean ciclo = true;

                switch (seleccion) {
                     case 1:
                        calcularCilindro.datosAreaCilindro();
                        calcularCilindro.calcularArea();
                        calcularCilindro.mostrarArea();
                        break;
                    case 2:
                        calcularRombo.datosAreaRombo();
                        calcularRombo.calcularArea();
                        calcularRombo.mostrarDatosArea();
                        break;
                    case 3:
                        calcularTrapecio.datosAreaTrapecio();
                        calcularTrapecio.calcularArea();
                        calcularTrapecio.mostrarDatosArea();
                        break;
                    case 4:
                        calcularTriangulo.datosAreaTriangulo();
                        calcularTriangulo.calcularArea();
                        calcularTriangulo.mostrarDatosArea();
                        break;
                    case 5:
                        ciclo = false;
                        System.out.print("Ha salido del programa exitosamente.");
                        respuesta = "no";
                        break;
                    default:
                        System.out.print("La opción que digitó es inválida.");
                        break;
                }

            }else if(opcion1 == 2){
                System.out.println("------------------------------------------------");
                System.out.print(" 1- Cilindro \n 2- Rombo \n 3- Trapecio \n 4- Triangulo \n 5- Salir \n Ingrese la figura que desea calcular: ");
                seleccion = capturar.nextInt();

                boolean ciclo = true;
                switch (seleccion) {
                    case 1:
                        System.out.print("Ingrese el radio: ");
                        double radio = capturar.nextDouble();
                        calcularCilindro.setRadio(radio);
                        calcularCilindro.mostrarDatosPerimetro();
                        break;
                    case 2:
                        calcularRombo.datosPerimetroRombo();
                        calcularRombo.calcularPerimetro();
                        calcularRombo.mostrarDatosPerimetro();
                        break;
                    case 3:
                        calcularTrapecio.datosPerimetroTrapecio();
                        calcularTrapecio.calcularPerimetro();
                        calcularTrapecio.mostrarDatosPerimetro();
                        break;
                    case 4:
                        calcularTriangulo.datosPerimetroTriangulo();
                        calcularTriangulo.calcularPerimetro();;
                        calcularTriangulo.mostrarDatosPerimetro();
                        break;
                    case 5:
                        ciclo = false;
                        System.out.print("Ha salido del programa exitosamente.");
                        respuesta = "no";
                        break;
                    default:
                        System.out.print("La opción que digitó es inválida.");
                        break;
                }

            }
            

            System.out.println(" ");
            System.out.print("¿Quiere volver a calcular otra figura?: ");
            respuesta = capturar.next();
            
        } while (respuesta.equalsIgnoreCase("si"));

        capturar.close();
    }
}
