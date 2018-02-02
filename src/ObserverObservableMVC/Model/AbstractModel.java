package ObserverObservableMVC.Model;

import Builder.Decorator.*;
import Builder.ElementsDuJeu;
import ObserverObservableMVC.Observer;
import Builder.Message;
import ObserverObservableMVC.Observable;
import Builder.GameOver;

import java.util.ArrayList;
import java.util.List;

import Builder.Score;

public abstract class AbstractModel implements Observable {

  final public ElementsDuJeu createurElement = new ElementsDuJeu();
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
  private ArrayList<Observer> listObserver = new ArrayList<Observer>();

  /**
   * Efface la fenetre
   */
  public abstract void reset() ;

  /**
   * Effectue le calcul de collision
   */
  public abstract Boolean colision();

  /**
   * Affichage forcé de la fenêtre pour éviter les scintillements
   */
  public abstract void update() ;


    /**
     * Définit les animauxAvecMouvement qui touchent ou non les animaux
     * @param AnimauxAvecMouvement
     */
    public abstract void setAnimauxAvecMouvement(ArrayList<AnimalAvecMouvement> AnimauxAvecMouvement);

    /**
     * Définit les animaux qui sont soit vivants soit morts
     * @param Animaux
     */
    public abstract void setAnimaux(ArrayList<Animal> Animaux);


  /**
   * Implémentation du pattern observer
   * @param observer une vue
   */
  public void addObserver(Observer observer) {
    this.listObserver.add(observer);
  }

  /**
   * Pour savoir quand une entree est en action et la notifier aux observers vues
   * @param inputing
   */
  public void notifyObserver(Boolean inputing) {
  if(inputing){
      //ref-to-do
    }
    else{
      //ref-to-do
    }
    for(Observer observer : listObserver){
      observer.update(inputing);
    }
  }

  /**
   * Construction à zéro de la liste des observers (Vue)
   */
  public void removeObserver() {
    listObserver = new ArrayList<Observer>();
  }

}