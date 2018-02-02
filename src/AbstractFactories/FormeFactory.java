package AbstractFactories;

import AbstractFactories.FormeFactories.Forme;

import java.awt.*;
import java.util.List;

public class FormeFactory extends AbstractFactory{

    public Forme getForme(){
        return new Forme() {

            java.util.List<Point> points;
            @Override
            public Forme getForme() {
                return this;
            }

            @Override
            public void setForme(java.util.List<Point> Points) {
                points = Points;
            }

            @Override
            public List<Point> getPoints() {
                return points;
            }
        };
    }
}
