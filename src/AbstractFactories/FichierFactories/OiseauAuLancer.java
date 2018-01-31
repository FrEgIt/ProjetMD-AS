package AbstractFactories.FichierFactories;

public class OiseauAuLancer implements Fichier {

    private String path = "oiseauAuLancer.png";
    @Override
    public OiseauAuLancer getFichier() {
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