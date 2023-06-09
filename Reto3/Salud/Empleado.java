package Reto3.Salud;


public class Empleado extends Persona {
    private String cargo ; 
    private float valorHora;
    private int horasTrabajadas;
    private String departamento;


    public Empleado(){

    }
    
    public Empleado(String tipoDoc, int documento,String nombre, String apellido, float valorHora, int horasTrabajadas){
        super(tipoDoc,documento,nombre,apellido);
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }





    public double calcularHonorarios(String tipoDoc, int documento,String nombre, String apellido, float valorHora, int horasTrabajadas){
        double reteica = 0.00966;
        double valorTotal = 100;
        double resHonorarios = ((valorHora * horasTrabajadas)- reteica)/valorTotal;
        System.out.println("El valor de los honorarios es de: "+resHonorarios);
        return resHonorarios;
    }


    

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


    







   
    



















}



