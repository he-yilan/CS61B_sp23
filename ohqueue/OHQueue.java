package ohqueue;

import java.util.Iterator;

/** Part b */
public class OHQueue implements Iterable{
    private OHRequest queue;

    public OHQueue(OHRequest queue) {
        this.queue = queue;
    }

    public Iterator<OHRequest> iterator() {
        return new TYIterator(queue);
    }
}
