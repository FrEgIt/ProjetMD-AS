package AbstractFactories.FormeFactories;


import java.util.List;

public class Point implements Forme {

    private List<java.awt.Point> points;

    @Override
    public Point getForme() {
        return this;
    }

    @Override
    public void setForme(List<java.awt.Point> Points) {
        points = Points;
    }

    @Override
    public List<java.awt.Point> getPoints() {
        return points;
    }
}