package iterator.collection;

import java.util.Iterator;

public class PairIterator implements Iterator<String> {
    private final Pair pair;
    private Integer nombreElementsParcourus = 0;

    public PairIterator(Pair pair) {
        this.pair = pair;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public String next() {
        return "";
    }
}
