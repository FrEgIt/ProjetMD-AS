package Builder.Decorator;


import Builder.ElementsDuJeu;

public abstract class Element {

    protected final ElementsDuJeu elementDuJeu = new ElementsDuJeu();

    public abstract void ajoutComposant();

}