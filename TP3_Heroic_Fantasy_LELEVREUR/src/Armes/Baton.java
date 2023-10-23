/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author alele
 */
public class Baton extends Arme {
    private int age;

    public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque); // Appel du constructeur de la classe Arme pour initialiser les paramètres hérités
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return super.toString() + ", Age : " + age;
    }
}

