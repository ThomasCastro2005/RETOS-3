package Reto4;
import java.util.Scanner;

public class Rombo extends Figuras{
    private double diagonalMayor;
    private double diagonalMenor;
    private double lado1;
    private double lado2;
    private double lado3;
    private double lado4;

    public Rombo(){
    }

    public Rombo(double diagonalMayor, double diagonalMenor, double lado1, double lado2, double lado3, double lado4){
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
    }


    public void datosAreaRombo(){
        Scanner capturar = new Scanner(System.in);
        System.out.println("Ingrese la diagonal Mayor: ");
        diagonalMayor = capturar.nextDouble();
        System.out.println("ingrese la diagonal Menor: ");
        diagonalMenor = capturar.nextDouble();
    }


    public void calcularArea(){
        double areaRombo = diagonalMayor*diagonalMenor/2;
    }


    public void mostrarDatosArea(){
        System.out.println("El area del Rombo es de: " + (diagonalMayor*diagonalMenor/2));
    }

    public void datosPerimetroRombo(){
        Scanner capturar = new Scanner(System.in);
        System.out.println("Ingrese el lado 1: ");
        lado1 = capturar.nextDouble();
        System.out.println("Ingrese el lado 2: ");
        lado2 = capturar.nextDouble();
        System.out.println("Ingrese el lado 3: ");
        lado3 = capturar.nextDouble();
        System.out.println("Ingrese el lado 4: ");
        lado4 = capturar.nextDouble();
    }

    public void calcularPerimetro(){
        double perimetroRombo = lado1+lado2+lado3+lado4;
    }

    public void mostrarDatosPerimetro(){
        System.out.println("El perimetro del Rombo es de: " + (lado1+lado2+lado3+lado4));
    }






    





















    //GETTERS Y SETTERS
    public double getDiagonalMayor() {
        return diagonalMayor;
    }

    public void setDiagonalMayor(double diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }

    public double getDiagonalMenor() {
        return diagonalMenor;
    }

    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public double getLado4() {
        return lado4;
    }

    public void setLado4(double lado4) {
        this.lado4 = lado4;
    }



    










}
