/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_lelevreur;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alele
 */
public class TP1_guessmynumber_LELEVREUR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


{
            try (Scanner scanner = new Scanner(System.in)) {
                Random generateurAleat = new Random();
                
                System.out.println("Bienvenue dans le jeu Guess My Number!");
                
                // Demandez à l'utilisateur de choisir le niveau de difficulté
                System.out.println("Choisissez le niveau de difficulté :");
                System.out.println("1) Facile (de 0 à 100, illimité d'essais)");
                System.out.println("2) Normal (de 0 à 100, 10 essais)");
                System.out.println("3) Difficile (de 0 à 100, 5 essais)");
                System.out.print("Entrez le numéro de votre choix : ");
                int niveau = scanner.nextInt();
                
                int min = 0;
                int max = 100;
                int essaisMax = 0;
                
                switch (niveau) {
                    case 1 -> essaisMax = Integer.MAX_VALUE; // Illimité d'essais
                    case 2 -> essaisMax = 10;
                    case 3 -> essaisMax = 5;
                    default -> {
                        System.out.println("Choix de niveau incorrect. Utilisation du niveau normal.");
                        essaisMax = 10;
                    }
                }
                
                int nombreAleatoire = generateurAleat.nextInt(max + 1);
                int nombreEssais = 0;
                int nombrePropose = -1;
                
                System.out.println("Devinez le nombre entre " + min + " et " + max + ".");
                
                while (nombrePropose != nombreAleatoire && nombreEssais < essaisMax) {
                    System.out.print("Entrez votre proposition : ");
                    nombrePropose = scanner.nextInt();
                    nombreEssais++;
                    
                    if (nombrePropose < nombreAleatoire) {
                        System.out.println("Trop petit !");
                    } else if (nombrePropose > nombreAleatoire) {
                        System.out.println("Trop grand !");
                    } else {
                        System.out.println("Gagné ! Vous avez trouvé le nombre en " + nombreEssais + " essais.");
                    }
                }
                
                if (nombreEssais >= essaisMax) {
                    System.out.println("Vous avez atteint le nombre maximum d'essais. Le nombre était " + nombreAleatoire + ".");
                }   }
    }
}

    }
    

