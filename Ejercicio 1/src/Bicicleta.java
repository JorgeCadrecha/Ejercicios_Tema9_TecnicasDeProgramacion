package Ejercicio1;

import java.time.LocalDate;

public class Bicicleta extends VehiculoAlquiler{
    private int velocidad;
    private final double tarifaHora = 4.9;

    public Bicicleta(String marca, String modelo, LocalDate fechaAlquiler, int velocidad) {
        super(marca, modelo, fechaAlquiler);
        this.velocidad = velocidad;
    }

    @Override
    public double getTarifaHora() {
        return tarifaHora;
    }

    @Override
    public String toString(){
        return "Bicicleta " + super.toString() + " " + this.velocidad + " velocidad";
    }

}