package _1poo._13solid._5dependencyinversion.bon;

public class Main {
    public static void main(String[] args) {
        ServiceEnregistement serviceEnregistement;
        if (args[0] == "sql") {
            serviceEnregistement = new ServiceEnregistementSql();
        } else {
            serviceEnregistement = new ServiceEnregistementFichier();
        }
        FenetrePrincipale fenetrePrincipale = new FenetrePrincipale(serviceEnregistement);
    }
}
