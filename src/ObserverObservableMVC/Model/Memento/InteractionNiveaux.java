package ObserverObservableMVC.Model.Memento;

import java.util.ArrayList;
import java.util.List;

public class InteractionNiveaux {

    final private List<Memento> mementoList = new ArrayList<>();

    public void addMemento(Memento memento){
        mementoList.add(memento);
    }

    public Memento getMemento(int index){
        return mementoList.get(index);
    }


    public List<Memento> getMementoList() {
        return mementoList;
    }
}
