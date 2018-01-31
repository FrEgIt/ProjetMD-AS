package AbstractFactories.FormeFactories;

import java.awt.Point;
import java.util.List;

public class Triangle implements Forme {


    private List<java.awt.Point> points;

    @Override
    public Triangle getForme() {
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