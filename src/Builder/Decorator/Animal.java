package Builder.Decorator;


import AbstractFactories.CouleurFactory;
import AbstractFactories.FichierFactories.Fichier;
import AbstractFactories.FichierFactory;
import AbstractFactories.FormeFactories.Forme;
import AbstractFactories.CouleurFactories.Couleur;
import AbstractFactories.FormeFactory;

import javax.swing.*;
import java.awt.*;

//http://www.java2s.com/Tutorial/Java/0240__Swing/GettingImageobjectfromImageIconobject.htm
//https://docs.oracle.com/javase/7/docs/api/javax/swing/ImageIcon.html
public class Animal extends Element {


    protected Forme point;

    protected Couleur couleur;

    protected Fichier fichier;

    protected Image image;

    protected ImageIcon imageIcon;

    @Override
    public void ajoutComposant() {
        factory = new FormeFactory();
        point = factory.getForme();
        factory = new CouleurFactory();
        couleur = factory.getCouleur();
        factory = new FichierFactory();
        fichier = factory.getFichier();
    }

    public Forme getPoint() {
        return point;
    }

    public void setPoint(Forme point) {
        this.point = point;
    }

    public Fichier getFichier() {
        return fichier;
    }

    public void setFichier(Fichier fichier) {
        this.fichier = fichier;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public ImageIcon getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }
}