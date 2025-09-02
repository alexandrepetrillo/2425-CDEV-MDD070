package iterator.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        //testSurArrayList();
        //testSurHashSet();
        //testSurPair();
        //testSurTriplet();
        testSurTuple();
    }

    private static void testSurTuple() {
        Tuple tuple = new Triplet("A", "B", "C");
        for (Iterator<String> it = tuple.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }
        for (String x : tuple) {
            System.out.println(x);
        }
    }

    private static void testSurPair() {
        Pair pair = new Pair("A", "B");
        System.out.println(pair.getVal1());
        System.out.println(pair.getVal2());
    }

    private static void testSurTriplet() {
        Triplet triplet = new Triplet("A", "B", "C");
        System.out.println(triplet.getVal1());
        System.out.println(triplet.getVal2());
        System.out.println(triplet.getVal3());
    }

    private static void testSurHashSet() {
        Set<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");

        //foreach autorisé car le set est iterable
        for (String s : set) {
            System.out.println(s);
        }

        //stream autorisé car la liste est iterable
        set.stream().forEach(System.out::println);

        for (Iterator<String> it = set.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }

    }

    private static void testSurArrayList() {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");


        //foreach autorisé car la liste est iterable
        for (String s : list) {
            System.out.println(s);
        }

        //stream autorisé car la liste est iterable
        list.stream().forEach(System.out::println);

        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //equivalent
        int x = 0;
        while (x < list.size()) {
            System.out.println(list.get(x));
            x++;
        }
    }
}
