package Reto5.Interfaces;
import java.util.Scanner;

public class Ppt implements Juego {
    
  // declaramos los Atributos
    private int numero; 
    private int numero1;
    private String manoM;
    private String manoU;

    public Ppt(){

    }

    public void Ppt(int numero, int numero1, String manoM, String manoU){
         this.numero = numero;
         this.numero1 = numero1;
         this.manoM = manoM;
         this.manoU = manoU;
    }

        



        public void iniciar(){
            Scanner capturar = new Scanner(System.in);
            System.out.println("que deseas sacar : \n 1. piedra  2. papel  3. tijeras");
            numero1 = capturar.nextInt();
        switch (numero1) {
            case 1:
                manoU = "piedra";
                System.out.println("elegiste la piedra");
            break;
            case 2:
                manoU = "papel";
                System.out.println("elegiste sacar papel");
            break;
            case 3:
                manoU = "tijeras";
                System.out.println("elegiste sacar tijeras");
            break;
        }
          }
    
    public void jugar(){Scanner capturar = new Scanner(System.in);
        // hacemos que la maquina elija que quiere sacar
        numero = (int)(Math.random() * 3);
        switch (numero) {
            case 1:
                manoM = "piedra";
                // System.out.println("elegiste la piedra");
            break;
            case 2:
                manoM = "papel";
                // System.out.println("elegiste sacar papel");
            break;
            case 3:
                manoM = "tijeras";
                // System.out.println("elegiste sacar tijeras");
            break;
        }
        
    }

    public void finalizar(){
        if (manoU.equalsIgnoreCase("piedra") && manoM.equalsIgnoreCase("tijeras")){
            System.out.println(" el usuario gana");
        } else if (manoU.equalsIgnoreCase("papel") && manoM.equalsIgnoreCase("piedra")){
            System.out.println(" el usuario gana");
        } else if (manoU.equalsIgnoreCase("tijeras") && manoM.equalsIgnoreCase("papel")){
            System.out.println(" el usuario gana");
        } else if (manoU.equalsIgnoreCase("papel") && manoM.equalsIgnoreCase("papel")){
            System.out.println(" ocurrio un empate, nadie gana");
        } else if (manoU.equalsIgnoreCase("piedra") && manoM.equalsIgnoreCase("piedra")){
            System.out.println(" ocurrio un empate, nadie gana");
        } else if (manoU.equalsIgnoreCase("tijeras") && manoM.equalsIgnoreCase("tijeras")){
            System.out.println(" ocurrio un empate, nadie gana");
        } else if (manoU.equalsIgnoreCase("piedra") && manoM.equalsIgnoreCase("papel")){
            System.out.println(" la maquina gana");
        } else if (manoU.equalsIgnoreCase("tijeras") && manoM.equalsIgnoreCase("piedra")){
            System.out.println(" la maquina gana");
        } else if (manoU.equalsIgnoreCase("papel") && manoM.equalsIgnoreCase("tijeras")){
            System.out.println(" la maquina gana");
        } else {
            System.out.println("Ocurrio un error");
        }
    }
}

