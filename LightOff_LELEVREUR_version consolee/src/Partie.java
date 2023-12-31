/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alele
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Partie {

    GrilleDeJeu grille;
    int nbCoups;
    int nbCoupsMax;
    boolean loose = false;

    /**
     * constructeur : génère une grille vide et initialise les coups de
     * l'utilisateur à 0
     *
     * @param dim dimension de la matrice/grille
     */
    public Partie(int dim) {
        this.grille = new GrilleDeJeu(dim, dim);
        this.grille.genererNouvelleMatriceCellulesLumineuses();
        nbCoups = 0;
    }

    /**
     * initialise la partie : mélange la grille
     *
     * @param diff difficulté choisi
     */
    public void initialiserPartie(int diff) {
        int n = 5;
        // mélange la grille
        switch (diff) {
            case 5 -> {
                n = 20;
                nbCoupsMax = 20;
                break;
            }
            case 6 -> {
                n = 100;
                nbCoupsMax = 10;
                break;
            }
            case 7 -> {
                n = 300;
                nbCoupsMax = 8;
                break;
            }
        }
        grille.genererMatriceAleatoire(n);
    }

    /**
     * demande et récupère le niveau de difficulté choisi par l'utilisateur
     *
     * @return int le niveau de difficulté
     */
    /**
     * lance la partie, contient la boucle jeu
     */
    public void lancerPartie() {
        Scanner sc = new Scanner(System.in);
        boolean coupValide;
        List<Character> listeDeCaracteres = new ArrayList<>();
        listeDeCaracteres.add('0');
        listeDeCaracteres.add('1');
        listeDeCaracteres.add('2');
        listeDeCaracteres.add('3');
        listeDeCaracteres.add('4');
        listeDeCaracteres.add('5');
        if(nbCoupsMax == 10 || nbCoupsMax == 8) listeDeCaracteres.add('6');
        if (nbCoupsMax == 8) listeDeCaracteres.add('7');
        listeDeCaracteres.add('A');
        listeDeCaracteres.add('B');
        listeDeCaracteres.add('C');
        listeDeCaracteres.add('D');
        listeDeCaracteres.add('E');
        if(nbCoupsMax == 10 || nbCoupsMax == 8) listeDeCaracteres.add('F');
        if (nbCoupsMax == 8) listeDeCaracteres.add('G');
        listeDeCaracteres.add('Y');
        listeDeCaracteres.add('Z');

        // affichage du message de bienvenu
        bienvenu();

        // affiche l'état initial de la grille
        System.out.println(grille.toString());

        while (!grille.cellulesToutesEteintes()) {
            // boucle jeu
            int nbCoupsRestants = nbCoupsMax - nbCoups;
            while (true) {
                System.out.println("Coups restants : " + nbCoupsRestants);
                System.out.println("Choississez une ligne, une colonne ou une diagonale :");
                char coup = sc.next().charAt(0);
                // demande le coup + fais la saisie clavier
                coupValide = listeDeCaracteres.contains(coup);
                if (Character.isDigit(coup) && coupValide) {
                    // activation dans le cas de la colonne
                    grille.activerColonneDeCellules(Character.getNumericValue(coup));
                    break;
                } else if (coup == 'Y') {
                    grille.activerDiagonaleDescendante();
                    break;
                } else if (coup == 'Z') {
                    grille.activerDiagonaleMontante();
                    break;
                } else if (coupValide){
                    grille.activerLigneDeCellules(coup);
                    break;
                }
            }
            System.out.println(grille.toString());
            nbCoups += 1;

            if (nbCoups == nbCoupsMax) {
                loose = true;
                break;
            }
        }
        // affichage du message de fin de jeu
        if (loose) {
            gameOver();
            Defaite();
        } else {
            gameOver();
            Victoire();
        }

    }

    void Victoire() {
        System.out.println("Felicitation vous avez gagner en " + nbCoups + " coups !");
    }

    void Defaite() {
        System.out.println("Vous avez utilises trop de coups, vous avez perdu :( \n Essayez encore !");
    }

    void bienvenu() {
        System.out.println("BIENVENUE SUR LIGHTOFF");
    }
 
    void gameOver(){
 System.out.println("END");
    
    }
}

