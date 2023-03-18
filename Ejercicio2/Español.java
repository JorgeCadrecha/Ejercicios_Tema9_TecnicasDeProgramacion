package Ejercicio2;

public class Español implements Idiomas{


    public String introducirDistancia() {
        return "Introduzca la distancia recorrida en metros: ";
    }


    public String introducirTiempo() {
        return  "Introduzca el tiempo en segundos: ";
    }


    public String inicioRespuesta() {
        return "La velocidad media es: ";
    }


    public String finRespuesta(double velocidad_Media) {
        return velocidad_Media + " m/s en Km/h: " + velocidad_Media * 3.6 ;
    }
}
