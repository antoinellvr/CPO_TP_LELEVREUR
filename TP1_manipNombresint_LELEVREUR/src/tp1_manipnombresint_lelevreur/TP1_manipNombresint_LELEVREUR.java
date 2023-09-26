/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_lelevreur;

import java.util.Scanner;

/**
 * TP1
 *
 * @author alele
 */
public class TP1_manipNombresint_LELEVREUR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
// Demande à l'utilisateur de saisir le premier entier
        try ( Scanner scanner = new Scanner(System.in)) {
            
// Demande à l'utilisateur de saisir le premier entier
            System.out.print("Veuillez saisir le premier entier : ");
            int premierEntier = scanner.nextInt();
            
// Demande à l'utilisateur de saisir le deuxième entier
            System.out.print("Veuillez saisir le deuxième entier : ");
            int deuxiemeEntier = scanner.nextInt();
            
// Calcule la somme, la différence et le produit des deux entiers
            int somme = premierEntier + deuxiemeEntier;
            int difference = premierEntier - deuxiemeEntier;
            int produit = premierEntier * deuxiemeEntier;
            
// Affiche les résultats
            System.out.println("Somme : " + somme);
            System.out.println("Différence : " + difference);
            System.out.println("Produit : " + produit);
            
// Calcule le quotient entier et le reste de la division euclidienne
            int quotient = premierEntier / deuxiemeEntier;
            int reste = premierEntier % deuxiemeEntier;
            
// Affiche le quotient et le reste
            System.out.println("Quotient entier : " + quotient);
            System.out.println("Reste de la division : " + reste);
            
// Ferme le scanner pour éviter les fuites de ressources
        }
    }
}
