package Builder.Decorator;

import Builder.Decorator.Animal;
import AbstractFactories.VitesseFactories.Vitesse;
import AbstractFactories.GraviteFactories.Gravite;

public class AnimalAvecMouvement extends Animal {


    protected Vitesse vitesse;

    protected Gravite gravite;

    @Override
    public void ajoutComposant() {
        point = elementDuJeu.getForme();
        couleur = elementDuJeu.getCouleur();
        fichier = elementDuJeu.getFichier();
        vitesse = elementDuJeu.getVitesse();
        gravite = elementDuJeu.getGravite();
    }

    public Vitesse getVitesse() {
        return vitesse;
    }

    public void setVitesse(Vitesse vitesse) {
        this.vitesse = vitesse;
    }

    public Gravite getGravite() {
        return gravite;
    }

    public void setGravite(Gravite gravite) {
        this.gravite = gravite;
    }

}