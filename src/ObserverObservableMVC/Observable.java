package ObserverObservableMVC;

import String;

public interface Observable {

  
  public void addObserver(Observer Observer);

  public void removeObserver();

  public void notifyObserver(String message);

}