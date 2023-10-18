/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_lelevreur;

/**
 *
 * @author alele
 */



// Déclaration de la classe abstraite Arme
public abstract class Arme {

    // Déclaration des attributs de l'arme
    private String nom;            // Nom de l'arme
    private int niveauAttaque;     // Niveau d'attaque de l'arme

    // Constructeur de la classe Arme, permet d'initialiser les attributs
    public Arme(String nom, int niveauAttaque) {
        this.nom = nom;
        this.niveauAttaque = niveauAttaque;
    }

    // Méthode permettant de récupérer le niveau d'attaque de l'arme
    public int getNiveauAttaque() {
        return niveauAttaque;
    }

    // Méthode permettant de récupérer le nom de l'arme
    public String getNom() {
        return nom;
    }

    // Redéfinition de la méthode toString pour afficher les informations de l'arme
    @Override
    public String toString() {
        return "Nom de l'arme : " + nom + ", Niveau d'attaque : " + niveauAttaque;
    }
}


