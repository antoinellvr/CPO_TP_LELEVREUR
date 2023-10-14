/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_manip_lelevreur;

/**
 *
 * @author alele
 */
public class Tartiflette {
    int nbCalories;
    


public Tartiflette(int nbCalories ){
     this.nbCalories = nbCalories;
}

    // Méthode pour incrémenter les calories
public void incrementeCalories(int increment) {
        nbCalories += increment;
    }

}