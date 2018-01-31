package AbstractFactories.FichierFactories;

public class Lanceur implements Fichier {

    private String path = "lanceur.png";
    @Override
    public Lanceur getFichier() {
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