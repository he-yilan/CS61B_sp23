import org.junit.Test;

import static org.junit.Assert.*;

public class DessertTest {

    @Test
    public void compareTest() {
        DessertComparator dc = new DessertComparator();

        Dessert cheesecake = new Dessert("cheesecake", 4, 5;
        Dessert pie = new Dessert("pie", 4, 5);
        Dessert froyo = new Dessert("froyo", 2, 3);
        Dessert cookie = new Dessert("cookie", 2, 2);
        /*
        Dessert cheesecake = new Dessert("cheesecake", 4, 5, 5, 4);
        Dessert pie = new Dessert("pie", 4, 5, 3, 5);
        Dessert froyo = new Dessert("froyo", 2, 3, 2, 2);
        Dessert cookie = new Dessert("cookie", 2, 2, 1, 1);

         */

        assertEquals(0, cheesecake.compareTo(pie));
        assertEquals(1, dc.compare(cheesecake, pie));
        assertEquals(-1, dc.compare(cookie, cheesecake));
        assertEquals(-1, dc.compare(froyo, pie));
        assertEquals(1, dc.compare(pie, froyo));
    }
}