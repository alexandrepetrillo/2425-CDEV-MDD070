package iterator.collection;

import java.util.Iterator;

public class MaLinkedListIterator implements Iterator<String> {

    private final MaLinkedList maLinkedList;
    private Slot currentSlot;

    public MaLinkedListIterator(MaLinkedList maLinkedList) {
        this.maLinkedList = maLinkedList;
        this.currentSlot = maLinkedList.premierSlot;
    }

    @Override
    public boolean hasNext() {
        return this.currentSlot.getNextSlot() != null;
    }

    @Override
    public String next() {
        String valeur = this.currentSlot.getValeur();
        this.currentSlot = this.currentSlot.getNextSlot();
        return valeur;
    }
}
