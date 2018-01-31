package AbstractFactories.VitesseFactories;


public class VitesseOiseau implements Vitesse {

   private double x = 0, y = 0;

  @Override
  public void setVitesse(double X, double Y) {
    x = X;
    y = Y;
  }

  @Override
  public VitesseOiseau getVitesse() {
    return this;
  }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }


}