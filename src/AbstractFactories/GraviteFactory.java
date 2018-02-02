package AbstractFactories;


import AbstractFactories.GraviteFactories.Gravite;


public class GraviteFactory extends AbstractFactory{


    public Gravite getGravite(){
        return new Gravite() {
            double gravite;
            @Override
            public void setGravite(double Gravite) {
                gravite = Gravite;
            }

            @Override
            public Gravite getGravite() {
                return this;
            }

            @Override
            public double getValeur() {
                return gravite;
            }
        };
    }
}
