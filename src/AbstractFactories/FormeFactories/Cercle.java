package AbstractFactories.FormeFactories;

import java.awt.Point;
import java.util.List;

public class Cercle implements Forme {

    private List<java.awt.Point> points;

    @Override
    public Cercle getForme() {
        return this;
    }

    @Override
    public void setForme(List<Point> Points) {
        points = Points;
    }

    @Override
    public List<Point> getPoints() {
        return points;
    }


}