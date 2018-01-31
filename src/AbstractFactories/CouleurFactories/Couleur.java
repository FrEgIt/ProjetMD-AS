package AbstractFactories.CouleurFactories;

public interface Couleur {

  
  public Couleur getCouleur();

  public void SetCouleur(int R, int V, int B);

  public void SetCouleur(int RGB);

  public void SetCouleur(String RGB);

  public int getR();

  public int getV();

  public int getB();

}