package AbstractFactories.FichierFactories;

public class CochonMort implements Fichier {

    private String path = "cochonMort.png";
    @Override
    public CochonMort getFichier() {
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