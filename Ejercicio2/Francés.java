package Ejercicio2;

public class Francés implements Idiomas{

    public String introducirDistancia() {
        return "Entrez la distance parcourue en mètres:  ";
    }


    public String introducirTiempo() {
        return  "Entrez le temps en secondes: ";
    }


    public String inicioRespuesta() {
        return "La vitesse moyenne est: ";
    }


    public String finRespuesta(double velocidad_Media) {
        return velocidad_Media + " m/s et en Km/h: " + velocidad_Media * 3.6 ;
    }
}
