package Reto5.Interfaces;

import java.util.Scanner;

public class Caraysello implements Juego{
     Scanner capturar = new Scanner(System.in);
    //ATRIBUTOS
     private int number;
     private String elec;
     private String elecU;     

    public Caraysello(){
    }

    public Caraysello(int number, String elec, String elecU){
        this.number = number;
        this.elec = elec;
        this.elecU = elecU;
    }
        
        
            

      

    public void iniciar(){
        System.out.println("Elije ¿cara o sello?");
        elec = capturar.nextLine();
        elec.toLowerCase();
    }
    
    public void jugar(){
         switch(elec){
            case "cara":
                System.out.println("elegiste cara");
                elecU = "cara";
            break;
            case "sello":
                System.out.println("elegiste sello");
                elecU = "sello";
            break;
        }
        System.out.println("la moneda esta girando");

    }

    public void finalizar(){
          // giro de la moneda
        number = (int) (Math.random()*2);
        switch(number){
            case 0:
                elec = "cara";
                System.out.println("cayo cara");
            break;
            case 1:
                elec = "sello";
                System.out.println("cayo sello");
            break;
        }

        if (elec == elecU){
            System.out.println("ganaste");
        } else {
            System.out.println("perdiste");
        }



    }
}
