package composite.fichier.bon;

public class Main {
    public static void main(String[] args) {
        Fichier fichier1 = new Fichier("fichier1", 100);
        Fichier fichier2 = new Fichier("fichier2", 102);
        Fichier fichier3 = new Fichier("fichier3", 306);

        Dossier repertoire1 = new Dossier("repertoire1");
        repertoire1.add(fichier1);
        repertoire1.add(fichier2);
        Dossier repertoire2 = new Dossier("repertoire2");
        repertoire2.add(fichier3);

        Dossier repertoire3 = new Dossier("repertoire3");
        repertoire3.add(repertoire1);
        repertoire3.add(repertoire2);

        Dossier repertoire4 = new Dossier("repertoire4");
        repertoire4.add(repertoire3);

        System.out.println(repertoire4.calculerTaille());

    }
}
