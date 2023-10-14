/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_relation_1_lelevreur;

/**
 *
 * @author alele
 */
//  class Voiture
public class Voiture {
    //les attributs, le constructeur, et la méthode 
    //toString() comme vus dans les exercices précédents.
    
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne proprietaire;
   
    
    public Voiture(String Model, String brand, int puissanceCV){      
// constructeur de la classe voiture
        
        Modele = Model;
        Marque = brand;
        PuissanceCV = puissanceCV;
        proprietaire = null;
    }
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = "\nmodel : " + Modele + "\nbrand : " + Marque +"\npuissanceCV : " + PuissanceCV;
        return chaine_a_retourner ;

    }
}