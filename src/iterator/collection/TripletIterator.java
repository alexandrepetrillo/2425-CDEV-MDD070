package iterator.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class TripletIterator implements Iterator<String> {
    private final Triplet triplet;
    private Integer nombreElementsParcourus = 0;

    public TripletIterator(Triplet triplet) {
        this.triplet = triplet;
    }

    @Override
    public boolean hasNext() {
        return nombreElementsParcourus < 3;
    }

    @Override
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String val;
        if (nombreElementsParcourus == 0) {
            val = triplet.getVal1();
        } else if (nombreElementsParcourus == 1) {
            val = triplet.getVal2();
        } else {
            val = triplet.getVal3();
        }
        nombreElementsParcourus++;
        return val;
    }
}
