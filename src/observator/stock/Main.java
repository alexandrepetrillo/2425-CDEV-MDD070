package observator.stock;

public class Main {
    public static void main(String[] args) {
        Magasin magasin = new Magasin();
        SiteAppleCom siteAppleCom = new SiteAppleCom();

        Client client = new Client();
        magasin.subscribe(client);
        siteAppleCom.subscribe(client);

        Reparateur reparateur = new Reparateur();
        magasin.subscribe(reparateur);

        magasin.recevoirNoueauModele();

        siteAppleCom.infoNouveauModele();
    }
}
