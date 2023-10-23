/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author alele
 */
public abstract class Personnage {
        //declaration du nom et du niveaux de vie du perso
    String nom; //declaration nom
    int nvxdevie; //declaration du niveaux de vie
    ArrayList<Arme> Inventaire = new ArrayList<Arme>();
    Arme arme_en_main;
 
    
public Personnage(String nom, int nvxdevie){
    this.nom= nom;
    this.nvxdevie= nvxdevie;
    arme_en_main = null;

}
      // Méthode permettant de récupérer le niveau d'attaque de l'arme
    public int getNiveauAttaque() {
        return nvxdevie;
    }

    // Méthode permettant de récupérer le nom de l'arme
    public String getNom() {
        return nom;
    }

    // Redéfinition de la méthode toString pour afficher les informations de l'arme
    @Override
    public String toString() {
        return "Nom de l'arme : " + nom + ", Niveau de vie : " + nvxdevie;
    }
}


