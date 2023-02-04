import java.util.Comparator;

/**
 * For those who are indecisive
 * @author Elana Ho
 */

public class Dessert implements Comparable<Dessert> {
    private String name;
    private int votes;
    private int flavor;
    private int nutrition;
    private int cost;

    public Dessert(String name, int votes, int flavor, int nutrition, int cost) {
        this.name = name;
        this.flavor = flavor;
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
        return flavor + nutrition - cost;
    }

    @Override
    public int compareTo(Dessert d) {
        return this.votes - d.getVotes(); // if positive, it means d1 is better
    }
}
