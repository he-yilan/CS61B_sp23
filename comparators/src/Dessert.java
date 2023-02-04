/**
 * For those who are indecisive
 * @author Elana Ho
 */

public class Dessert implements Comparable<Dessert> {
    private String name;
    private int votes;
    private int flavor;

    public Dessert(String name, int votes, int flavor) {
        this.name = name;
        this.votes = votes;
        this.flavor = flavor;
    }

    public int getVotes() {
        return votes;
    }

    public int getFlavor() {
        return flavor;
    }

    /**
     * Compares desserts according to the number of votes each receives.
     */
    @Override
    public int compareTo(Dessert d) {
        return this.votes - d.getVotes(); // if positive, it means d1 is better
    }
}
