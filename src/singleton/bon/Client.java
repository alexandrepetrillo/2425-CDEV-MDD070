package singleton.bon;

public class Client {
    public static void main(String[] args) {
        Logger logger1 = Logger.getLogger();

        Logger logger2 = Logger.getLogger();

        // les 2 variables correspondent au même objet
        // exemple d'avantage on garantie l'ordre de prise en compte des logs
    }
}
