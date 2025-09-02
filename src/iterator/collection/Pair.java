package iterator.collection;

import java.util.Iterator;

public class Pair implements Tuple {
    private String val1;
    private String val2;

    public Pair(String val1, String val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public String getVal1() {
        return val1;
    }

    public String getVal2() {
        return val2;
    }

    @Override
    public Iterator<String> iterator() {
        return new PairIterator(this);
    }
}
