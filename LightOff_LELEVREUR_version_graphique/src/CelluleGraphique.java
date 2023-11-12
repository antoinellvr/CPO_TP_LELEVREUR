
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author alele
 */
public class CelluleGraphique extends JButton {

    int largeur; // largeur en pixel de la cellule
    int hauteur; // hauteur en pixel de la cellule
    CelluleLumineuse celluleLumineuseAssociee;
    // constructeur (appelé depuis FenetrePrincipale)

    public CelluleGraphique(CelluleLumineuse celluleLumineuseAssociee, int largeur,
            int hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.celluleLumineuseAssociee = celluleLumineuseAssociee;
    }
    // Methode gérant le dessin de la cellule

    @Override
    protected void paintComponent(Graphics g) {
        if (celluleLumineuseAssociee.estEteint()==false) g.setColor(Color.red);
        if (celluleLumineuseAssociee.estEteint()==true) g.setColor(Color.black);
        g.fillOval(0,0,30,30);
        //super.paintComponent(g);
       // this.setText(celluleLumineuseAssociee.toString());
    }
}
