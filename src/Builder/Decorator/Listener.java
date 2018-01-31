package Builder.Decorator;

import AbstractFactories.FormeFactories.Forme;

public class Listener extends Element {

  protected Forme point;

  public void ajoutComposant(){
    point = elementDuJeu.getForme();
  }
}