package Ejercicio1;

import java.time.LocalDate;

public class Vehiculos {
    public static void ejecutar(){
       
        VehiculoAlquiler Bici1 = new Bicicleta("Lapierre", "speed 400", LocalDate.of(2022, 3, 14), 27);
        VehiculoAlquiler Bici2 = new Bicicleta("Btwinn", "speed 400", LocalDate.of(2023, 3, 14), 27);
        VehiculoAlquiler Giro1 = new Giroscopio("Segway", "Nine", LocalDate.of(2022, 3, 14), 40);
        VehiculoAlquiler Giro2 = new Giroscopio("Weebot", "Echo", LocalDate.of(2023, 3, 14), 35);
        VehiculoAlquiler Seg1 = new Segway("Immotion", "V8", LocalDate.of(2023, 3, 14), 1.2, 40);
        VehiculoAlquiler Seg2 = new Segway("Segway", "Ninebot", LocalDate.of(2023, 3, 14), 1.2, 30);

        System.out.println(Bici1.toString()) ; Bici1.getTarifaHora();
    }
}