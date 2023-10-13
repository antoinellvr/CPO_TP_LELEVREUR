/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_lelevreur;

/**
 *
 * @author alele
 */
public class TP2_manip_LELEVREUR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
       
        
         // assiette3 référence la même tartiflette que assiette2
         Tartiflette assiette3 = assiette2 ;
          assiette2 = assiette1;
          assiette1 = assiette3;
        
        // Affichage du nombre de calories de chaque tartiflette
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories);
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);
        // Incrémentation des calories d'une tartiflette
        assiette1.incrementeCalories(100);

        //Moussaka assiette666 = assiette1 ;  parce  que  l'assiette  666 n'est pas créer
        //Moussaka assiette667 = new Tartiflette() ;
        
        //Moussaka assiette666 = assiette1 ;
        //Moussaka assiette667 = new Tartiflette() ;
        
        // Ces 2 lignes de code sont fausses car elles demandent de convertir un objet en un autre objet
        // Ici on assimile à un objet de type Moussaka un objet de type Tartiflette
        // Une référence objet qui annonce référencer un type d'objet ne peut pas en référencer un autre qui n'a aucun rapport

        
            Moussaka [] tab = new Moussaka [10];
    
    for (int i=0;i<10;i++){
        tab[i] = new Moussaka(i);
        System.out.println(tab[i].nbCalories);
    }
    
    }   
}