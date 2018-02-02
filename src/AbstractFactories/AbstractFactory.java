package AbstractFactories;

import AbstractFactories.FichierFactories.Fichier;
import AbstractFactories.VitesseFactories.Vitesse;
import AbstractFactories.FormeFactories.Forme;
import AbstractFactories.CouleurFactories.Couleur;
import AbstractFactories.GraviteFactories.Gravite;

public class AbstractFactory {


    public Forme getForme() {
        return null;
    }

    public Couleur getCouleur() {
        return null;
    }

    public Fichier getFichier() {
        return null;
    }

    public Vitesse getVitesse() {
        return null;
    }

    public Gravite getGravite() {
        return null;
    }

}