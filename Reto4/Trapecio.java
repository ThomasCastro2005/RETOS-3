package Reto4;
import java.util.Scanner;

public class Trapecio extends Figuras{
    private double baseMayor;
    private double baseMenor;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;
    private double lado4;



    public Trapecio(){
    }
    public Trapecio(double baseMayor, double baseMenor, double altura, double lado1, double lado2, double lado3, double lado4){
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
    }

    public void datosAreaTrapecio(){
        Scanner capturar = new Scanner(System.in);
        System.out.print("ingrese la base Mayor: ");
        baseMayor = capturar.nextDouble();
        System.out.print("ingrese la base Menor: ");
        baseMenor = capturar.nextDouble();
        System.out.print("ingrese la Altura: ");
        altura = capturar.nextDouble();
    }

    public void calcularArea(){
        double areaTrapecio = (baseMayor+baseMenor/2)*altura;
    }

    public void mostrarDatosArea(){
        System.out.println("El area del trapecio es de: " + (baseMayor+baseMenor/2)*altura);
    }
    
    public void datosPerimetroTrapecio(){
        Scanner capturar = new Scanner(System.in);
        System.out.print("Ingrese el lado 1: ");
        lado1 = capturar.nextDouble();
        System.out.print("Ingrese el lado 2: ");
        lado2 = capturar.nextDouble();
        System.out.print("Ingrese el lado 3: ");
        lado3 = capturar.nextDouble();
        System.out.print("Ingrese el lado 4: ");
        lado4 = capturar.nextDouble();
    }

    public void calcularPerimetro(){
        double suma = (lado1+lado2+lado3+lado4);
    }

    public void mostrarDatosPerimetro(){
        System.out.println("El perimetro del trapecio es de: " + (lado1+lado2+lado3+lado4));
    }

















    //GETTERS Y SETTERS
    public double getBaseMayor() {
        return baseMayor;
    }
    public void setBaseMayor(double baseMayor) {
        this.baseMayor = baseMayor;
    }
    public double getBaseMenor() {
        return baseMenor;
    }
    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }


    




}
