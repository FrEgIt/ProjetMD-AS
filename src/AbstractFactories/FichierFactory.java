package AbstractFactories;

import AbstractFactories.FichierFactories.Fichier;


public class FichierFactory extends AbstractFactory {


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


}
