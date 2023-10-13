/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_lelevreur;


/**
 *
 * @author alele
 */
public class TP2_Bieres_LELEVREUR {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args){
        
        BouteilleBiere uneBiere = new BouteilleBiere("cuvée des trolls", 7, "Debuisson") ; //on crée une nouvelle instance de BouteilleBiere
        //uneBiere.nom = "Cuvée des trolls";
        //uneBiere.degreAlcool = 7.0 ;
        //uneBiere.lireEtiquette();
        
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6, "Abbayee de Leffe");
        
        //autreBiere.degreAlcool = 6.6;
        //autreBiere.nom = "Leffe";
        //autreBiere.brasserie = "Abbaye de Leffe";
        
        BouteilleBiere b3 = new BouteilleBiere("cubanisto", 1, "aaa");
        BouteilleBiere b4 = new BouteilleBiere("heineken", 2, "bbb");
        BouteilleBiere b5 = new BouteilleBiere("Shouff", 3, "ccc");
        
        //b3.lireEtiquette();
        System.out.println(b3.toString());      // on affiche les caractéristiques de la biere b3
        b4.Decapsuler();
        System.out.println(b4.toString());
    }
    
}