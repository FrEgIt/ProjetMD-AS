package Builder.Decorator;


import AbstractFactories.AbstractFactory;
import Builder.ElementsDuJeu;

public abstract class Element {

    protected AbstractFactory factory;

    protected final ElementsDuJeu elementDuJeu = new ElementsDuJeu();

    public abstract void ajoutComposant();

}

