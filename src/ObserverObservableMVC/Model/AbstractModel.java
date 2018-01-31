package ObserverObservableMVC.Model;

import Builder.Decorator.*;
import Builder.ElementsDuJeu;
import ObserverObservableMVC.Observer;
import Builder.Message;
import ObserverObservableMVC.Observable;
import Builder.GameOver;

import java.util.List;

import Builder.Score;

public abstract class AbstractModel implements Observable {

  public List<Animal> animaux;

  public Terrain terrain;

  public Ciel ciel;

  public Lanceur lanceur;

  public List<AnimalAvecMouvement> animauxAvecMouvement;

  public Souris souris;

  public Message message;

  public Score score;

  public GameOver gameOver;

  public Clavier clavier;

  public Fenetre fenetre;

  final public ElementsDuJeu createurElement = new ElementsDuJeu();

  public List<Observable>  myObservable;

  public void reset() {
  }

  public void addObserver(Observer observer) {
  }

  public void notifyObserver(String message) {
  }

  public void removeObserver() {
  }

}