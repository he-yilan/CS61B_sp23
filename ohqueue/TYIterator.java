package ohqueue;

import java.util.Iterator;

/** Part d */
public class TYIterator extends OHIterator {
    public TYIterator(OHRequest queue) {
        super(queue);
    }

    @Override
    public OHRequest next() {
        OHRequest result = super.next();
        if (result != null && result.description.contains("thank u")) {
            result = super.next();
        }
        return result;
    }

}