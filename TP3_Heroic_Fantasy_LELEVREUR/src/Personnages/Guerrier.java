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
public class Guerrier extends Personnage{
      boolean Cheval;
    String Attribut ;
    
    public Guerrier(String unNom, int uneVie, String unCheval) {
        super(unNom, uneVie);
        Attribut = unCheval;
        if (unCheval=="a Cheval"){
            Cheval = true ;
        }
        else{
            Cheval = false ;
        }
        
    }
        @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = "Personnage :" +nom +" : "+ nvxdevie + " , "+Attribut+" , " ;
        return chaine_a_retourner ;
     
    }
    
    
}

