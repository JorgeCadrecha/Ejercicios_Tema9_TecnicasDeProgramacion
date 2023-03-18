package Ejercicio1;

import java.time.LocalDate;

public class Segway extends VehiculoAlquiler{
    private double alturaMinima;
    private double autonomiaKm;

    private final double tarifaHora = 18.9;
    public Segway(String marca, String modelo, LocalDate fechaAlquiler, double alturaMinima, double autonomiaKm) {
        super(marca, modelo, fechaAlquiler);
        this.alturaMinima = alturaMinima;
        this.autonomiaKm = autonomiaKm;
    }

    @Override
    public double getTarifaHora() {
        return this.tarifaHora;
    }

    @Override
    public String toString(){
        return "Segway " + super.toString() + " " + this.autonomiaKm + "km";
    }
}