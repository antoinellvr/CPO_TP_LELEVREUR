/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_relation_1_lelevreur;

/**
 *
 * @author alele
 */
// def de la classe
public class Personne {
    //les attributs, le constructeur, et la méthode 
    //toString() comme vus dans les exercices précédents.

    String Prenom;
    String Nom;
    int nbVoitures;
    Voiture[] liste_voitures;

    public Personne(String prenom, String nom) {
//constructeur de la classe personne
//, il suffit de rajouter dans la liste de ses attributs 
//un attributs liste_voitures, qui serait un tableau 
//de références vers des voitures, 3 au plus

        Prenom = prenom;
        Nom = nom;
        liste_voitures = new Voiture[3];
        nbVoitures = 0;
    }

    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = "\nnom : " + Nom + "\nprenom : " + Prenom + "\nnombre de voitures : " + nbVoitures;
        return chaine_a_retourner;
    }

    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {
        if (voiture_a_ajouter.proprietaire != null) {
            System.out.println(voiture_a_ajouter + "voiture volee !!");
            return false;
            //Si la voiture à ajouter possède déjà un propriétaire (voiture volée !!)
        } else {
            if (this.nbVoitures == 3) {
                System.out.println(this.Nom + this.Prenom + "a déjà 3 voitures");
                return false;
                //Si le propriétaire a déjà 3 voitures, le tableau est plein.
            } else {
                this.liste_voitures[nbVoitures] = voiture_a_ajouter;
                nbVoitures += 1;
                voiture_a_ajouter.proprietaire = this;
                return true;
                // il faut dire à la voiture que son propriétaire est 
                //l’objet qui est en train d’exécuter la méthode ajouter_voiture

            }
        }
    }
}
