package AbstractFactories.FichierFactories;

public class OiseautAReussit implements Fichier {

    private String path = "oiseautAReussit.png";
    @Override
    public OiseautAReussit getFichier() {
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