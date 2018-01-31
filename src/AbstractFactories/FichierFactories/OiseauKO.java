package AbstractFactories.FichierFactories;

public class OiseauKO implements Fichier {

    private String path = "oiseauKO.png";
    @Override
    public OiseauKO getFichier() {
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