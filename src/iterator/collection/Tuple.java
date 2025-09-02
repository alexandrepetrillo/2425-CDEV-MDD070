package iterator.collection;

import java.util.Iterator;

public interface Tuple extends Iterable<String> {
    Iterator<String> iterator();
}
