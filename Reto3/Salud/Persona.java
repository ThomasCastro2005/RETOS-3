package Reto3.Salud;
import java.util.Scanner;

public class Persona {
    //SE DECLARAN LOS ATRIBUTOS
    private  String tipoDoc;
    private  int documento;
    private  String nombre;
    private  String apellido;
    private  double peso;
    private  double estatura;
    private  int edad;
    private  String sexo;

    
    public Persona() {
    }

    public Persona(String tipoDoc,int documento, String nombre, String apellido){
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.estatura = estatura;
        this.edad = edad;
        this.sexo = sexo;
    }



    // METODO SETTERS Y GETTERS

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public String getTipoDoc() {
        return tipoDoc;
    }

    public int getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getPeso() {
        return peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }
    

   





    //SE DECLARAN LOS METODOS

    public void pedirDatos(){
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

    public void mostrarPersona(){
 
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

    
    public String calcularImc(){
        double imc = peso / (estatura * estatura);
        if (imc < 20) {
            return "PESOBAJO";
        } else if (imc >= 20 && imc <= 25) {
            return "PESOIDEAL";
        } else {
            return "SOBREPESO";
        }
    }
    

    public  void mayorEdad(){
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
