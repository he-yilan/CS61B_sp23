public class UnionFind {
    private int[] nodes;

    /**
     * Creates a UnionFind data structure holding N items. Initially, all
     * items are in disjoint sets. Each of the indices represent a node, and
     * the values in the array are its parent. If the node does not have a parent,
     * the value is the size of the set * -1.
     */
    public UnionFind(int N) {
        nodes = new int[N];

        for (int i = 0; i < N; i++) {
            nodes[i] = -1;
        }
    }

    /**
     * Returns the size of the set node u is in.
     */
    public int sizeOf(int u) {
        return -nodes[find(u)];
    }

    /**
     * Returns whether 2 nodes are in the same set.
     */
    public boolean isSameSet(int u, int v) {
        return find(u) == find(v);
    }

    /**
     * Unions 2 sets together.
     */
    public void union(int u, int v) {
        if (isSameSet(u, v)) {
            return;
        }
        int rootU = find(u);
        int rootV = find(v);

        if (sizeOf(u) <= sizeOf(v)) {
            nodes[rootV] += nodes[rootU];
            nodes[rootU] = rootV;
        } else {
            nodes[rootU] += nodes[rootV];
            nodes[rootV] = rootU;
        }
    }

    /**
     * Finds the representative (root) of the set node v is in.
     */
    public int find(int u) {
        int root = u;
        while (nodes[root] >= 0) {
            root = nodes[root];
        }
        return root;
    }

    /**
     * Finds the representative (root) of the set node v is in using recursion.
     */
    public int findRecursive(int u) {
        if (nodes[u] < 0) {
            return u;
        }
        return findRecursive(nodes[u]);
    }
}
