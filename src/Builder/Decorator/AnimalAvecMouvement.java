package Builder.Decorator;

import AbstractFactories.*;
import Builder.Decorator.Animal;
import AbstractFactories.VitesseFactories.Vitesse;
import AbstractFactories.GraviteFactories.Gravite;

public class AnimalAvecMouvement extends Animal {


    protected Vitesse vitesse;

    protected Gravite gravite;

    @Override
    public void ajoutComposant() {

        factory = new FormeFactory();
        point = factory.getForme();

        factory = new CouleurFactory();
        couleur = factory.getCouleur();

        factory = new FichierFactory();
        fichier = factory.getFichier();

        factory = new VitesseFactory();
        vitesse = factory.getVitesse();

        factory = new GraviteFactory();
        gravite = factory.getGravite();
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