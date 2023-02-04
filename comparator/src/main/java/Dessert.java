import java.util.Comparator;

/**
 * For those who are indecisive
 * @author Elana Ho
 */

public class Dessert implements Comparable<Dessert> {
    private String name;
    private int votes;
    private int sweetness;
    private int nutrition;
    private int cost;

    public Dessert(String name, int votes, int sweetness, int nutrition, int cost) {
        this.name = name;
        this.sweetness = sweetness;
        this.nutrition = nutrition;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getVotes() {
        return votes;
    }

    public int getEnjoyment() {
        return sweetness + nutrition - cost;
    }

    @Override
    public int compareTo(Dessert d) {
        return this.votes - d.getVotes(); // if positive, it means d1 is better
    }

    public class DessertComparator implements Comparator<Dessert> {

        @Override
        public int compare(Dessert d1, Dessert d2) {
            if (d1.compareTo(d2) != 0) {
                return d1.compareTo(d2);
            } else {
                int enjoyment1 = d1.getEnjoyment();
                int enjoyment2 = d2.getEnjoyment();
                if (enjoyment1 > enjoyment2) {
                    return 1;
                } else if (enjoyment2 > enjoyment1) {
                    return -1;
                } else {
                    return d1.getName().compareTo(d2.getName());
                }
            }
        }
    }
}
