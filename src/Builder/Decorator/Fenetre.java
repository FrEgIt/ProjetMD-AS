package Builder.Decorator;

import AbstractFactories.CouleurFactories.Couleur;
import AbstractFactories.CouleurFactories.Gris;
import AbstractFactories.FormeFactories.Forme;
import AbstractFactories.FormeFactory;

import java.awt.*;


public class Fenetre extends Element {

  public Forme rectangle;

  public Couleur couleur;

  public Image buffer;

  @Override
  public void ajoutComposant() {
    factory = new FormeFactory();
    rectangle = factory.getForme();
    couleur = (Couleur) new Gris();
  }
}