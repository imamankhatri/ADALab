package khatri;

public class pg17 {
    final static int V = 5;
    int path[];

    public boolean isSafe(int v, int graph[][], int path[], int pos) {
        if (graph[path[pos - 1]][v] == 0)
            return false;
        for (int i = 0; i < pos; i++)
            if (path[i] == v)
                return false;
        return true;
    }

    public boolean hamCycle(int graph[][], int path[], int pos) {
        if (pos == V) {
            if (graph[path[pos - 1]][path[0]] == 0)
                return false;
            else
                return true;
        }
        for (int i = 0; i < V; i++)
            if (isSafe(i, graph, path, pos)) {
                path[pos] = i;
                if (hamCycle(graph, path, pos + 1))
                    return true;
                else
                    path[pos] = -1;
            }
        return false;
    }


    public static void main(String[] args) {

        int graph[][] = {{0, 1, 0, 0, 1},
                {1, 0, 1, 0, 0},
                {0, 1, 0, 1, 0},
                {0, 0, 1, 0, 1},
                {1, 0, 0, 1, 0},
        };
        pg17 H = new pg17();
        for (int p = 0; p < 5; p++) {
            int path[] = new int[V];
            for (int i = 0; i < V; i++)
                path[i] = -1;
            path[0] = p;
            if (H.hamCycle(graph, path, 1) == false)
                System.out.print("\nNo solution");

            else {
                System.out.println("\nSolution exists");
                for (int i = 0; i < V; i++)
                    System.out.print(path[i] + "\t");
                System.out.println(path[0]);
            }
        }
    }
}

