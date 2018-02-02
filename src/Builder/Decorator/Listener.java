package Builder.Decorator;

import AbstractFactories.FormeFactories.Forme;
import AbstractFactories.FormeFactory;

public class Listener extends Element {

  protected Forme point;

  public void ajoutComposant(){
    factory = new FormeFactory();
    point = factory.getForme();
  }
}