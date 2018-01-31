package AbstractFactories;

import AbstractFactories.FichierFactories.Fichier;
import AbstractFactories.VitesseFactories.Vitesse;
import AbstractFactories.FormeFactories.Forme;
import AbstractFactories.CouleurFactories.Couleur;
import AbstractFactories.GraviteFactories.Gravite;

public abstract class AbstractFactory {


  abstract public Forme getForme() ;

  abstract public Couleur getCouleur();

  abstract public Fichier getFichier() ;

  abstract public Vitesse getVitesse() ;

  abstract public Gravite getGravite() ;

}