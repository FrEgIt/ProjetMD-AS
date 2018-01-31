package ObserverObservableMVC.Model.Memento;

import ObserverObservableMVC.Model.Memento.TemplatMethod.Jeu;

public class Memento {

    public Jeu state;

    public Memento( Jeu state) {
        this.state = state;
    }

    public Jeu getState() {
        return null;
    }


}
