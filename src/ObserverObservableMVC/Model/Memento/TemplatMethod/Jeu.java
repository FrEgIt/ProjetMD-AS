package ObserverObservableMVC.Model.Memento.TemplatMethod;

import ObserverObservableMVC.Model.AbstractModel;
import ObserverObservableMVC.Model.Memento.Memento;

public abstract class Jeu extends AbstractModel {

  protected Jeu state;

  public void reset() {
    //
  }

  public abstract void init();

  public void distance( ) {
  }

  /*bool Collision(AABB box1,AABB box2)
  {
    if(         (box2.x >= box1.x + box1.w)      // trop à droite
            ||  (box2.x + box2.w <= box1.x) // trop à gauche
            ||  (box2.y >= box1.y + box1.h) // trop en bas
            ||  (box2.y + box2.h <= box1.y))  // trop en haut
      return false;
    else
      return true;
  }*/

  public void stop() {
  }

  public void run() {
  }

  public void calcul() {
  }

  public Jeu getState() {
    return state;
  }

  public void setState(Jeu state) {
    this.state = state;
  }

  public Memento saveStateToMethod(){
      return new Memento(state);
  }

}