/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stat_lelevreur;

import java.util.Scanner;

/**
 *TP1 stat
 * @author alele
 */
public class TP1_stat_LELEVREUR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
// Créer un tableau de 6 entiers et l'initialiser à 0
        int[] tableau = new int[6];
        
       
// Demander à l'utilisateur de saisir un nombre entier m
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre entier m : ");
        int m = scanner.nextInt();
           
// Faites une boucle de m itérations
        for (int i = 0; i < m; i++) {
            // Tirez un nombre aléatoire entre 0 et 5 inclus
            int nombreAleatoire = (int) (Math.random() * 6);
            
// Incrémentez la case d'indice correspondant dans le tableau
            tableau[nombreAleatoire]++;
        }
        
// Affichez le tableau résultat sous forme de pourcentages
        System.out.println("Résultats sous forme de pourcentages :");
        for (int i = 0; i < 6; i++) {
            double pourcentage = (double) tableau[i] / m * 100.0;
            System.out.printf("Face %d : %.2f%%\n", (i + 1), pourcentage);
        }
        
        // Fermez le scanner
        scanner.close();
    }
}

    

