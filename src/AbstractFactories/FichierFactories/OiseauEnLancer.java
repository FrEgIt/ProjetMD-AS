package AbstractFactories.FichierFactories;

public class OiseauEnLancer implements Fichier {
    private String path = "oiseauEnLancer.png";
    @Override
    public OiseauEnLancer getFichier() {
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