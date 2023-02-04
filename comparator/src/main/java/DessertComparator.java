import java.util.Comparator;

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
                int difference = d1.getName().compareTo(d2.getName());
                if (difference > 0) {
                    return 1;
                } else if (difference < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        DessertComparator dc = new DessertComparator();
        Dessert cheesecake = new Dessert("cheesecake", 4, 5, 5, 4);
        Dessert pie = new Dessert("pie", 4, 5, 3, 5);
        Dessert froyo = new Dessert("froyo", 2, 3, 2, 2);
        Dessert cookie = new Dessert("cookie", 1, 2, 1, 1);

        if (dc.compare(cheesecake, pie) == 1) {
            System.out.println("Let's get cheesecake!");
        }
    }
}