package iterator.arbre;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Arbre a1 = new Arbre("A1");

        Arbre b1 = new Arbre("B1");
        Arbre b2 = new Arbre("B2");
        Arbre b3 = new Arbre("B3");
        a1.addEnfant(b1);
        a1.addEnfant(b2);
        a1.addEnfant(b3);

        Arbre c1 = new Arbre("C1");
        Arbre c2 = new Arbre("C2");
        Arbre c3 = new Arbre("C3");
        b1.addEnfant(c1);
        b1.addEnfant(c2);
        b1.addEnfant(c3);

        System.out.println("recurssif");
        parcourirRecurssif(a1);

        System.out.println("iteratif");
        parcourirIteratif(a1);

        // EXO 1 : appliquer le design pattern Iterator sur la classe Arbre afin de pouvoir utiliser un foreach:
        // for (String x : a1) {
        //     System.out.println(x);
        // }

    }

    private static void parcourirRecurssif(Arbre a) {
        System.out.println(a.getValeur());
        for (Arbre enfant : a.getEnfants()) {
            parcourirRecurssif(enfant);
        }
    }

    private static void parcourirIteratif(Arbre a) {
        List<Arbre> temp = new ArrayList<>();
        temp.add(a);

        while (!temp.isEmpty()) {
            Arbre x = temp.remove(0);
            System.out.println(x.getValeur());
            temp.addAll(x.getEnfants());
        }
    }
}
