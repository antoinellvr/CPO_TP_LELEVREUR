/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Personnages.Personnage;

/**
 *
 * @author alele
 */
public class Magicien extends Personnage{
    boolean Confirme;
    String Attribut;
    
     public Magicien(String unNom, int uneVie, String unConfirme) {
        super(unNom, uneVie);
        Attribut = unConfirme;
        if (unConfirme=="Confirme"){
            Confirme = true ;
        }
        else{
            Confirme = false ;
        }
        
    }
     

 @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = "Personnage :" +nom +" : "+ nvxdevie + " , "+Attribut +" , ";
        return chaine_a_retourner ;
     
    }
    
}
    

