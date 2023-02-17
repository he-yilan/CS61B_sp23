import static org.junit.Assert.*;

public class UnionFindTest {

    @org.junit.Test
    public void sameSet() {
        int N = 8;
        UnionFind uf = new UnionFind(N);
        uf.union(1, 2);
        uf.union(2, 3);
        assertTrue(uf.sameSet(1, 3));
        for (int i = 0; i < N-1; i++) {
            uf. union(i, i+1);
        }
        for (int i = 0; i < N-1; i++) {
            assertTrue(uf.sameSet(i, i+1));
        }
    }

    @org.junit.Test
    public void union() {
    }

    @org.junit.Test
    public void find() {
    }
}