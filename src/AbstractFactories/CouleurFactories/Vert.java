package AbstractFactories.CouleurFactories;

public class Vert implements Couleur {


    private int R=0, V=255, B=0;


    @Override
    public Vert getCouleur() {
        return this;
    }

    @Override
    public void SetCouleur(int R, int V, int B) {
        this.R = R;
        this.V = V;
        this.B = B;
    }

    @Override
    public void SetCouleur(int RGB) {

    }

    @Override
    public void SetCouleur(String RGB) {

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
        return B;
    }
}