/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_lelevreur;

import java.util.Scanner;

/**
 * TP1 EXO2
 *
 * @author alele
 */
public class TP1_convertisseur_LELEVREUR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( // TODO code application logic here
                 Scanner scanner = new Scanner(System.in)) {
            System.out.println("Bonjour, saisissez une valeur de température en degrés Celsius :");
            double temperatureCelsius = scanner.nextDouble();

            System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
            System.out.println("1) De Celcius vers Kelvin");
            System.out.println("2) De Kelvin vers Celcius");
            System.out.println("3) De Farenheit vers Celcius");
            System.out.println("4) De Celcius vers Farenheit");
            System.out.println("5) De Kelvin vers Farenheit");
            System.out.println("6) De Farenheit vers Kelvin");

            int choix = scanner.nextInt();

            switch (choix) {
                case 1 -> {
                    double kelvin = CelciusVersKelvin(temperatureCelsius);
                    System.out.println(temperatureCelsius + " degrés Celsius sont égaux à " + kelvin + " degrés Kelvin.");
                }
                case 2 -> {
                    double celsius = KelvinVersCelcius(temperatureCelsius);
                    System.out.println(temperatureCelsius + " degrés Kelvin sont égaux à " + celsius + " degrés Celsius.");
                }
                case 3 -> {
                    double farenheitToCelsius = FarenheitVersCelcius(temperatureCelsius);
                    System.out.println(temperatureCelsius + " degrés Farenheit sont égaux à " + farenheitToCelsius + " degrés Celsius.");
                }
                case 4 -> {
                    double celsiusToFarenheit = CelciusVersFarenheit(temperatureCelsius);
                    System.out.println(temperatureCelsius + " degrés Celsius sont égaux à " + celsiusToFarenheit + " degrés Farenheit.");
                }
                case 5 -> {
                    double kelvinToFarenheit = KelvinVersFarenheit(temperatureCelsius);
                    System.out.println(temperatureCelsius + " degrés Kelvin sont égaux à " + kelvinToFarenheit + " degrés Farenheit.");
                }
                case 6 -> {
                    double farenheitToKelvin = FarenheitVersKelvin(temperatureCelsius);
                    System.out.println(temperatureCelsius + " degrés Farenheit sont égaux à " + farenheitToKelvin + " degrés Kelvin.");
                }
                default -> System.out.println("Choix invalide.");
            }
        }
    }

    // Méthode pour convertir degrés Celsius en Kelvin
    public static double CelciusVersKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Méthode pour convertir Kelvin en degrés Celsius
    public static double KelvinVersCelcius(double kelvin) {
        return kelvin - 273.15;
    }

    // Méthode pour convertir degrés Farenheit en degrés Celsius
    public static double FarenheitVersCelcius(double farenheit) {
        return (farenheit - 32) * 5 / 9;
    }

    // Méthode pour convertir degrés Celsius en degrés Farenheit
    public static double CelciusVersFarenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Méthode pour convertir Kelvin en degrés Farenheit
    public static double KelvinVersFarenheit(double kelvin) {
        double celsius = KelvinVersCelcius(kelvin);
        return CelciusVersFarenheit(celsius);
    }

    // Méthode pour convertir degrés Farenheit en Kelvin
    public static double FarenheitVersKelvin(double farenheit) {
        double celsius = FarenheitVersCelcius(farenheit);
        return CelciusVersKelvin(celsius);
    }
}
    

