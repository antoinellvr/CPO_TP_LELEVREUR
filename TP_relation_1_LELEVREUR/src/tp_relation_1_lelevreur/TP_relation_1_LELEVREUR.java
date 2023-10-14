/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_relation_1_lelevreur;

/**
 *
 * @author alele
 */
public class TP_relation_1_LELEVREUR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //les lignes de création et manipulation des objets à mettre 
        //dans la méthode main()
        Voiture uneClio = new Voiture("Clio", "Renault", 5);

        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);

        Voiture une2008 = new Voiture("2008", "Peugeot", 6);

        Voiture uneMicra = new Voiture("Micra", "Nissan", 4);

        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");

        System.out.println("liste des voitures disponibles " + uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra);

        bob.liste_voitures[0] = uneClio;
        bob.nbVoitures = 1;
        uneClio.proprietaire = bob;

        System.out.println("la premiere voiture de Bob est " + bob.liste_voitures[0] + "\net la deuxieme est " + bob.liste_voitures[1]);

        bob.liste_voitures[1] = une2008;
        bob.nbVoitures = 2;
        une2008.proprietaire = bob;

        reno.liste_voitures[0] = uneMicra;
        reno.nbVoitures = 1;
        uneMicra.proprietaire = reno;

        reno.liste_voitures[1] = uneAutreClio;
        reno.nbVoitures = 2;
        uneAutreClio.proprietaire = reno;
        
//Ajoute une seconde voiture à Bob, et deux autres voitures à Reno
        System.out.println("la premiere voiture de Reno est " + reno.liste_voitures[0] + "\net la deuxieme est " + reno.liste_voitures[2]);

    }

}
