package AbstractFactories;

import AbstractFactories.CouleurFactories.Couleur;


import java.awt.*;
import java.util.List;

public class CouleurFactory extends AbstractFactory{

    public Couleur getCouleur(){
        return new Couleur() {
            private int R;
            private int V;
            private int B;
            @Override
            public Couleur getCouleur() {
                return this;
            }

            @Override
            public void SetCouleur(int R, int V, int B) {
                this.R = R;
                this.B = B;
                this.V = V;
            }

            @Override
            public void SetCouleur(int RGB) {
                // to do
            }

            @Override
            public void SetCouleur(String RGB) {
                //to do
            }

            @Override
            public int getR() {
                return R;
            }

            @Override
            public int getV() {
                return V;
            }

            @Override
            public int getB() {
                return V;
            }
        };
    }


}
