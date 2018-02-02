package ObserverObservableMVC;

public interface Observable {

  
  public void addObserver(Observer Observer);

  public void removeObserver();

  public void notifyObserver(Boolean inputing);

}