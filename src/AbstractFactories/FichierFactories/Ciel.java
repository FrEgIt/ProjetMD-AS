package AbstractFactories.FichierFactories;

public class Ciel implements Fichier {

    private String path = "ciel.png";
    @Override
    public Ciel getFichier() {
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