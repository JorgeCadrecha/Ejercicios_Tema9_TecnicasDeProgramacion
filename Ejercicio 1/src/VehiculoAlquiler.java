package Ejercicio1;

import java.time.LocalDate;

public abstract class VehiculoAlquiler {
    protected String marca;
    protected String modelo;
    protected LocalDate fechaAlquiler;


    public VehiculoAlquiler(String marca, String modelo, LocalDate fechaAlquiler) {
        this.marca = marca;
        this.modelo = modelo;
        this.fechaAlquiler = fechaAlquiler;
    }
    public int getEdad(){
        return this.fechaAlquiler.until(LocalDate.now()).getYears();
    }
    public abstract double getTarifaHora();

    @Override
    public  String toString(){
        int edad = this.getEdad();
        return this.marca + " " + this.modelo + " (" + edad + "años)";
    }
}