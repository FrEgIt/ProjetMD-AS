package AbstractFactories.FichierFactories;

public class Terrain implements Fichier {

    private String path = "terrain.png";
    @Override
    public Terrain getFichier() {
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