package Ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void ejecutar(){
        Scanner teclado = new Scanner(System.in);

        int opcion;
        Idiomas idiomas = null;
        System.out.println("Seleccione el idioma: / Select the language: / Sélectionnez la langue:");
        System.out.println("1. Español");
        System.out.println("2. English");
        System.out.println("3. Français");
        opcion = teclado.nextInt();
        try {
            switch (opcion){
                case 1:
                    idiomas = new Español();
                    break;
                case 2:
                    idiomas = new Inglés();
                    break;
                case 3:
                    idiomas = new Francés();
                    break;
                default:
                    System.out.println("⚠⚠ ¡El número que ha insertado es incorrecto😡!");
                    break;
            }
        }catch (InputMismatchException e){
            System.out.println("Inserte de nuevo una opcion valida");
            teclado.nextInt();
        }

        double valor1, valor2, resultado;
        System.out.println(idiomas.introducirDistancia());
        valor1 = teclado.nextDouble();

        System.out.println(idiomas.introducirTiempo());
        valor2 = teclado.nextDouble();

        resultado = valor1 / valor2;
        System.out.print(idiomas.inicioRespuesta());
        System.out.println(idiomas.finRespuesta(resultado));

    }


}
