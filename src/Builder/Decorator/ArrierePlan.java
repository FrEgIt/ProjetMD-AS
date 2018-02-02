package Builder.Decorator;

import AbstractFactories.FichierFactories.Fichier;
import AbstractFactories.FichierFactory;
import AbstractFactories.FormeFactories.Forme;
import AbstractFactories.FormeFactory;

import javax.swing.*;
import java.awt.*;

public abstract class ArrierePlan extends Element {

    private Forme forme;

    private Fichier fichier;

    protected Image image;

    protected ImageIcon imageIcon;

    @Override
    public void ajoutComposant() {
        factory = new FormeFactory();
        forme = factory.getForme();

        factory = new FichierFactory();
        fichier = factory.getFichier();
    }

    public Forme getForme() {
        return forme;
    }

    public void setForme(Forme forme) {
        this.forme = forme;
    }

    public Fichier getFichier() {
        return fichier;
    }

    public void setFichier(Fichier fichier) {
        this.fichier = fichier;
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