package ohqueue;

import java.util.Iterator;
import java.util.NoSuchElementException;

/** Part a */
public class OHIterator implements Iterator {
    private OHRequest curr;

    public OHIterator(OHRequest queue) {
        curr = queue;
    }

    public static boolean isGood(String description) {
        return description.length() >= 5;
    }


     @Override
     public boolean hasNext() {

         while (curr != null && isGood(curr.description)) {
            curr = curr.next;
         }
         if (curr == null) {
            return false;
         }
        return true;
     }

     @Override
     public OHRequest next() {

         if (!hasNext()) {
            throw new NoSuchElementException();
         }
         OHRequest currRequest = curr;
         curr = curr.next;
         return currRequest;
     }
}