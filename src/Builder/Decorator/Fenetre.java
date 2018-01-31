package Builder.Decorator;

import AbstractFactories.CouleurFactories.Couleur;
import AbstractFactories.CouleurFactories.Gris;
import AbstractFactories.FormeFactories.Forme;


public class Fenetre extends Element {

  public Forme rectangle;

  public Couleur couleur;

  @Override
  public void ajoutComposant() {
    rectangle = elementDuJeu.getForme();
    couleur = (Couleur) new Gris();
  }
}