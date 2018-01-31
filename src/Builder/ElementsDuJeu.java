package Builder;

import AbstractFactories.AbstractFactory;
import AbstractFactories.CouleurFactories.Couleur;
import AbstractFactories.FichierFactories.Fichier;
import AbstractFactories.FichierFactories.Terrain;
import AbstractFactories.FichierFactories.Lanceur;
import AbstractFactories.FormeFactories.Forme;
import AbstractFactories.GraviteFactories.Gravite;
import AbstractFactories.VitesseFactories.Vitesse;
import Builder.Decorator.*;
import AbstractFactories.FichierFactories.Ciel;

import java.util.List;

public class ElementsDuJeu extends AbstractFactory{


  public Fenetre creeFenetre() {
  return new Fenetre();
  }

  public Animal creeAnimal() {
  return new Animal();
  }

  public Terrain creeTerrain() {
  return new Terrain();
  }

  public Ciel creeCiel() {
  return new Ciel();
  }

  public Lanceur creeLanceur() {
  return new Lanceur();
  }

  public AnimalAvecMouvement creeAnimalAvecMouvement() {
  return new AnimalAvecMouvement();
  }

  public Souris creeSouris() {
  return new Souris();
  }

  public Message creeMessage() {
  return new Message();
  }

  public Score creeScore() {
  return new Score();
  }

  public GameOver creeGameOver() {  return new GameOver();  }

  public Clavier creeClavier() {  return new Clavier();  }


  public Forme getForme(){
    return new Forme() {

      List<java.awt.Point> points;
      @Override
      public Forme getForme() {
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
    };
  }

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

  public Fichier getFichier(){
    return new Fichier() {
      private String path;
      @Override
      public Fichier getFichier() {
        return this;
      }

      @Override
      public void setFichier(String Path) {
        path = Path;
      }

      @Override
      public String getPath() {
        return path;
      }
    };
  }

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