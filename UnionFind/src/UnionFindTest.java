import static org.junit.Assert.*;

public class UnionFindTest {

    @org.junit.Test
    public void sameSet() {
        int N = 8;
        UnionFind uf = new UnionFind(N);
        uf.union(1, 2);
        uf.union(2, 3);
        assertTrue(uf.isSameSet(1, 3));
        for (int i = 0; i < N-1; i++) {
            uf. union(i, i+1);
        }
        for (int i = 0; i < N-1; i++) {
            assertTrue(uf.isSameSet(i, i+1));
        }
    }

    @org.junit.Test
    public void union() {
        UnionFind u = new UnionFind(5);
        u.union(0,1);
        assertEquals(1, u.find(1));
        assertEquals(1, u.find(0));
        u.union(2,3);
        u.union(0,2);
        u.union(2, 4);
    }

    @org.junit.Test
    public void find() {
        UnionFind u = new UnionFind(6);
        u.union(0,1);
        assertEquals(1, u.find(1));
        assertEquals(1, u.find(0));
        u.union(2,3);
        u.union(0,2);
        assertEquals(3, u.find(1));
        assertEquals(3, u.find(2));
        assertEquals(3, u.find(3));
        assertEquals(4, u.sizeOf(0));
        assertEquals(4, u.sizeOf(1));
        assertEquals(4, u.sizeOf(2));
        assertEquals(4, u.sizeOf(3));
        assertEquals(1, u.sizeOf(4));
    }

    @org.junit.Test
    public void findRecursive() {
        UnionFind u = new UnionFind(6);
        u.union(0,1);
        assertEquals(1, u.find(1));
        assertEquals(1, u.find(0));
        u.union(2,3);
        u.union(0,2);
        assertEquals(3, u.find(1));
        assertEquals(3, u.find(2));
        assertEquals(3, u.find(3));
        assertEquals(4, u.sizeOf(0));
        assertEquals(4, u.sizeOf(1));
        assertEquals(4, u.sizeOf(2));
        assertEquals(4, u.sizeOf(3));
        assertEquals(1, u.sizeOf(4));
    }
}