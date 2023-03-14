package Ejercicio1;

import java.time.LocalDate;

public class Giroscopio extends VehiculoAlquiler{
    private double autonomiaKm;
    private final double tarifaHora = 29.9;

    public Giroscopio(String marca, String modelo, LocalDate fechaAlquiler, double autonomiaKm) {
        super(marca, modelo, fechaAlquiler);
        this.autonomiaKm = autonomiaKm;
    }

    @Override
    public double getTarifaHora() {
        return this.tarifaHora;
    }
    public double getAutonomiaKm() {
        return autonomiaKm;
    }
    public void setAutonomiaKm(double autonomiaKm) {
        this.autonomiaKm = autonomiaKm;
    }
    @Override
    public String toString(){
        return "Giroscopio "+ super.toString() + " " + this.autonomiaKm + "km" + " [1h 50min]";
    }
}