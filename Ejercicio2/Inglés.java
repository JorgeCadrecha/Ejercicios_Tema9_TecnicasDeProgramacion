package Ejercicio2;

public class Inglés implements Idiomas{
    public String introducirDistancia() {
        return "Enter the distance traveled in meters: ";
    }

    public String introducirTiempo() {
        return  "Enter the time in seconds: ";
    }

    public String inicioRespuesta() {
        return "The average speed is: ";
    }
    public String finRespuesta(double velocidad_Media) {
        return velocidad_Media + " m/s an in Km/h: " + velocidad_Media * 3.6;
    }
}
