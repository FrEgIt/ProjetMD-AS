package AbstractFactories.FichierFactories;

public class CochonVivant implements Fichier {

    private String path = "cochonVivant.png";
    @Override
    public CochonVivant getFichier() {
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
}