package iterator.collection;

import java.util.Iterator;

public class MaLinkedList implements Iterable<String> {

    Slot premierSlot = new Slot(null, null);

    void add(String x) {
        Slot lastSlot = getLastSlot();
        lastSlot.setValeur(x);
        lastSlot.setNextSlot(new Slot(null, null));
    }

    private Slot getLastSlot() {
        Slot currentSlot = premierSlot;
        while (currentSlot.getNextSlot() != null) {
            currentSlot = currentSlot.getNextSlot();
        }
        return currentSlot;
    }

    String get(int i) {
        Slot currentSlot = premierSlot;
        for (int x = 0; x < i; x++) {
            currentSlot = currentSlot.getNextSlot();
        }
        return currentSlot.getValeur();
    }

    int size() {
        int size = 0;
        Slot currentSlot = premierSlot;
        while (currentSlot.getNextSlot() != null) {
            currentSlot = currentSlot.getNextSlot();
            size++;
        }
        return size;
    }

    public static void main(String[] args) {
        MaLinkedList list = new MaLinkedList();
        list.add("A");
        list.add("B");
        System.out.println("Size=" + list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        list.add("B");
        list.add("B");
        list.add("B");
        list.add("B");
        list.add("B");
        list.add("B");
        list.add("B");
        list.add("B");
        list.add("B");
        list.add("B");

        System.out.println("foreach");
        for (String x : list) {
            System.out.println(x);
        }
    }

    @Override
    public Iterator<String> iterator() {
        return new MaLinkedListIterator(this);
    }
}
