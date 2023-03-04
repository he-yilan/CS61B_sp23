import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Set;

public class HashMap<K, V> {

    private class Node {
        String name;
        Set<String> potatoes;

        public Node(String name, Set<String> potatoes) {
            this.name = name;
            this.potatoes = potatoes;
        }
    }

    private Collection<Node>[] buckets;
    private int numBuckets;
    private int size;
    private double maxLoadFactor = 0.75; // ratio of items to number of buckets (average number of items per bucket)

    public HashMap(int numBuckets) {
        this.size = 0;
        this.numBuckets = numBuckets;
        buckets = new Collection[numBuckets];
        for (int i = 0; i < numBuckets; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public int hashFunction(String name) {
        return name.length();
    }

    public int getBucketIndex(String name) {
        return hashFunction(name) % numBuckets;
    }

    public Node getNode(String name) {
        int index = getBucketIndex(name);
        for (Node n : buckets[index]) {
            if (n.name.equals(name)) {
                return n;
            }
        }
        return null;
    }

    public boolean containsKey(String name) {
        return getNode(name) != null;
    }

    public void put(String name, Set<String> potatoes) {
        // check if the name is already in the HashMap
        if (containsKey(name)) {
            Set<String> newPotatoes = getNode(name).potatoes;
            for (String p : potatoes) {
                newPotatoes.add(p);
            }
            return;
        }
        // check if resize is needed
        if (((size + 1) / numBuckets) > maxLoadFactor) {
            resize(numBuckets * 2);
        }
        Node n = new Node(name, potatoes);
        int index = getBucketIndex(name);
        buckets[index].add(n);
    }

    public void resize(int newNumBuckets) {
        Collection<Node>[] newBuckets = new Collection[newNumBuckets];
        
    }

}
