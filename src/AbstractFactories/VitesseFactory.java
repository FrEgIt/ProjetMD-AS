package AbstractFactories;


import AbstractFactories.VitesseFactories.Vitesse;


public class VitesseFactory extends AbstractFactory {


    public Vitesse getVitesse(){
        return  new Vitesse() {

            double x, y;
            @Override
            public void setVitesse(double X, double Y) {
                x =X;
                y = Y;
            }

            @Override
            public Vitesse getVitesse() {
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
        };
    }

}
