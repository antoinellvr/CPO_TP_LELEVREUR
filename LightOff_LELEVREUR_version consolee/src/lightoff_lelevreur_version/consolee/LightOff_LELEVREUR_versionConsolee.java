/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author alele
 */
public class LightOff_LELEVREUR_versionConsolee {
/* Mini projet LE LEVREUR 
* VERSION CONSOLE
* OCTOBRE 2023
 */



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int n = demanderDifficulté();

        Partie partie = new Partie(n);

        partie.initialiserPartie(n);

        partie.lancerPartie();
    }

    /**
     * demande et récupère le niveau de difficulté choisi par l'utilisateur
     *
     * @return int le niveau de difficulté
     */
    static int demanderDifficulté() {
        int diff;
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez choisir une difficulté :\n 1 Facile \n 2 Moyen \n 3 Difficile");
        diff = sc.nextInt();
        int n = 5;
        // mélange la grille
        switch (diff) {
            case 1 ->
                n = 5;
            case 2 ->
                n = 6;
            case 3 ->
                n = 7;

        }
        return n;
    }
}

