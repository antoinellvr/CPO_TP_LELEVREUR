/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_lelevreur;
import Personnages.Magicien;
import Personnages.Guerrier;
import Personnages.Personnage;
import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author alele
 */
public class TP3_Heroic_Fantasy_LELEVREUR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // création des  2 épées avec différents paramétres
        Epee Excalibur = new Epee("Excalibur", 7, 5);
        Epee Durandal = new Epee("Durandal", 4, 7);
        Baton chene = new Baton("Chene", 4, 5);
        Baton charme = new Baton("Charme", 5, 6);

        //afficher les créations
        System.out.println(Excalibur);
        System.out.println(Durandal);
        System.out.println(chene);
        System.out.println(charme);

        ArrayList<Arme> TabArme = new ArrayList<Arme>();
        TabArme.add(Excalibur);
        TabArme.add(Durandal);
        TabArme.add(chene);
        TabArme.add(charme);

        for (int i = 0; i < 4; i++) {
            System.out.println(TabArme.get(i));
        }
    
//part2
    Magicien Magicien1= new Magicien("Gandalf",65,"Confirme");
    Magicien Magicien2= new Magicien("Garcimore",44,"novice");
    Guerrier Guerrier1= new Guerrier("Conan",78,"à pied");
    Guerrier Guerrier2= new Guerrier("Lannister", 45, "a cheval");
    
      
        ArrayList<Personnage> TabPersonnage = new ArrayList<Personnage>();
        TabPersonnage.add(Magicien1); 
        TabPersonnage.add(Magicien2);    
        TabPersonnage.add(Guerrier1);    
        TabPersonnage.add(Guerrier2);    
        
      for (int i =0; i<4 ;i++){
        System.out.println(TabPersonnage.get(i));
        }
        
    // Pa/rtie 3
    for (int i =0; i<10 ;i++){
        System.out.println("");
        }
    
    //creation des perso
    Magicien Magicien0 = new Magicien("Tonio",100,"Confirme");
    Guerrier Guerrier0 =new Guerrier("julio",76,"a cheval");
    

//Creation des 3 epees
    Epee Epee1 =new Epee("Baby",79,81);
    Epee Epee2 =new Epee("Delta",56,76);
    Epee Epee3 =new Epee ("Commando",35,58);
//Creation des 3 Baton   
    Baton Baton1 =new Baton("TOUTDUR",56,86);
    Baton Baton2 =new Baton("TOUTMOU",50,93);
    Baton Baton3 =new Baton("TOUTPOURRI",23,17);

//on ajoute ces 3 armes  au Guerrier   
    Guerrier0.AjoutArme(Epee1);
    Guerrier0.AjoutArme(Epee2);
    Guerrier0.AjoutArme(Baton3);
    
    Guerrier0.EquipeArme("Baby");
   
            
//on ajoute au magicien ces 3 armes     
    Magicien0.AjoutArme(Baton1);
    Magicien0.AjoutArme(Baton2);
    Magicien0.AjoutArme(Epee3);
    
    Magicien0.EquipeArme("TOUTMOU");
    
       System.out.println(Baton2);
       System.out.println(Baton3);
       System.out.println(Guerrier0);
       System.out.println(Magicien0);

          
        System.out.println("Il y a " + Magicien.nbMagicien + " magiciens");
        System.out.println("Il y a " + Guerrier.nbGuerrier + " guerriers");
        System.out.println("Il y a " + Personnage.nbPersos + " personnages");



}
           
    
    
}
