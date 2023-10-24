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
     public static int nbPersos;
 
    
public Personnage(String nom, int nvxdevie){
    this.nom= nom;
    this.nvxdevie= nvxdevie;
    arme_en_main = null;
     nbPersos ++;

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
    
       public void AjoutArme (Arme arme_a_ajouter){
        if (Inventaire.size()<=5){
                Inventaire.add(arme_a_ajouter);
        }
}
       public Arme getArme_en_main(){
           return arme_en_main;
       }
         public void EquipeArme (String unNomdArme){
        for ( int i=0; i< Inventaire.size(); i++){
            if(Inventaire.get(i).getNom().equals(unNomdArme)) {
                arme_en_main = Inventaire.get(i);
                System.out.println("Arme trouvee et affectee");
                break;
            }
            else{
                System.out.println("Arme pas trouvee et non affectee");

            }
        }
    }
    
    
}



