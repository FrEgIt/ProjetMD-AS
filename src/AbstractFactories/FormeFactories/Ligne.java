package AbstractFactories.FormeFactories;

import java.awt.Point;
import java.util.List;

public class Ligne implements Forme {


    private List<java.awt.Point> points;

    @Override
    public Ligne getForme() {
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