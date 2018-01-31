package AbstractFactories.FormeFactories;

import java.awt.Point;
import java.util.List;

public interface Forme {
          
  public Forme getForme();

  public void setForme(List<Point> Points);

  public List<Point> getPoints();

}