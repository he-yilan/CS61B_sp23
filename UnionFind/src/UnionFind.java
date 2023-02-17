public class UnionFind {
    private int[] parents;

    public UnionFind(int N) {
        parents = new int[N];

        for (int i = 0; i < N; i++) {
            parents[i] = -1;
        }
    }

    public boolean sameSet(int u, int v) {
        return find(u) == find(v);
    }

    public void union(int u, int v) {
        if (sameSet(u, v)) {
            return;
        }
        int rootU = find(u);
        int rootV = find(v);

        if (rootU > rootV) { // V's set is bigger
            parents[rootU] = rootV;
            parents[rootV] += parents[rootU];
        } else {
            parents[rootV] = rootU;
            parents[rootU] += parents[rootV];
        }
    }

    public int find(int v) {
        int root = v;
        while (root > 0) {
            root = parents[root];
        }
        return root;
    }
}
