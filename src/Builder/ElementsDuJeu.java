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

public class ElementsDuJeu {

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


}