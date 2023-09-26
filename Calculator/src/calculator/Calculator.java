/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/**
 * calculator
 *
 * @author alele
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Rentre l'operateur:\n 1) add\n 2) substract\n 3) multiply \n 4) divide \n 5) modulo ");

        try ( Scanner scanner = new Scanner(System.in)) {
            int operator = scanner.nextInt();

            System.out.println("Rentre le premier nombre:");
            double num1 = scanner.nextDouble();

            System.out.println("Rentre le deuxieme nombre:");
            double num2 = scanner.nextDouble();

            double result = 0.0;

            switch (operator) {
                case 1 ->
                    result = num1 + num2;
                case 2 ->
                    result = num1 - num2;
                case 3 ->
                    result = num1 * num2;
                case 4 -> {
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division par zero.");
                        System.exit(1);
                    }
                }
                case 5 -> {
                    if (num2 != 0) {
                        result = num1 % num2;
                    } else {
                        System.out.println("Error: Modulo par zero.");
                        System.exit(1);
                    }
                }
                default -> {
                    System.out.println("Invalid operation.");
                    System.exit(1);
                }
            }

            System.out.println("The result is: " + result);
        }
    }
}
