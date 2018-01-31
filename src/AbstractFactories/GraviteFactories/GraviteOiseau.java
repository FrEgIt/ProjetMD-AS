package AbstractFactories.GraviteFactories;

public class GraviteOiseau implements Gravite {

    private double gravite = 1.0;
    @Override
    public void setGravite(double Gravite) {
            gravite = Gravite;
    }

    @Override
    public Gravite getGravite() {
        return this;
    }

    public double getValeur() {
        return gravite;
    }
}