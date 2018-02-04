package ObserverObservableMVC.Model.EasyMemento;

import AbstractFactories.FormeFactories.Point;
import Builder.Decorator.Animal;
import Builder.Decorator.AnimalAvecMouvement;
import ObserverObservableMVC.Model.AbstractModel;
import ObserverObservableMVC.Observer;

import java.awt.*;
import java.util.ArrayList;

public abstract class Jeu extends AbstractModel {

    protected Jeu state;

    public Jeu getState() {
        return state;
    }

    public void setState(Jeu State) {
        this.state = State;
    }


    /**
     * Définit les animaux qui sont soit vivants soit morts
     *
     * @param Animaux
     */
    public void setAnimaux(ArrayList<Animal> Animaux) {
        animaux = Animaux;
    }


    public abstract void init();

    public Boolean distance(AnimalAvecMouvement animalAvecMouvement, Animal animal) {

        java.awt.Point box1 = getPointOfAnimal(animal);
        java.awt.Point dim1 = getSizeOfAnimal(animal);
        java.awt.Point box2 = getPointOfAnimal(animalAvecMouvement);
        java.awt.Point dim2 = getSizeOfAnimal(animalAvecMouvement);

        if ((box2.x >= box1.x + dim1.x)      // trop à droite
                || (box2.x + dim2.x <= box1.x) // trop à gauche
                || (box2.y >= box1.y + dim1.y) // trop en bas
                || (box2.y + dim2.y <= box1.y))  // trop en haut
            return false;
        else
            return true;
    }

    private java.awt.Point getPointOfAnimal(Animal animal){
        return animal.getPoint().getPoints().get(0);
    }

    private java.awt.Point getSizeOfAnimal(Animal animal){
        int height = animal.getImageIcon().getIconHeight();
        int width = animal.getImageIcon().getIconWidth();
        return new java.awt.Point(height, width);
    }


    public void stop() {
    }

    public void run() {
    }

    public void calcul() {
    }

    /**
     * met à vide les liste  animaux et animauxAvecMouvement
     */
    public void reset() {
        animaux = new ArrayList<>();
        animauxAvecMouvement = new ArrayList<>();
    }


    /**
     * Affichage forcé de la fenêtre pour éviter les scintillements
     */
    public abstract void update();

    /**
     * Définit les animauxAvecMouvement qui touchent ou non les animaux
     *
     * @param AnimauxAvecMouvement
     */
    public void setAnimauxAvecMouvement(ArrayList<AnimalAvecMouvement> AnimauxAvecMouvement) {
        animauxAvecMouvement = AnimauxAvecMouvement;
    }
}