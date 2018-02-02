package Builder.Decorator;

import AbstractFactories.FormeFactories.Forme;
import AbstractFactories.FormeFactory;

public class Listener extends Element {

  protected Forme point;

  private Boolean inputing;

  public Boolean isInputing() {
    return inputing;
  }

  public void setInputing(Boolean inputing) {
    this.inputing = inputing;
  }

  public void ajoutComposant(){
    factory = new FormeFactory();
    point = factory.getForme();
  }
}