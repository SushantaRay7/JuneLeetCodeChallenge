class Solution {
    
    int minPathCost;

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        minPathCost = Integer.MAX_VALUE; 
        Map<Integer, List<int[]>> graph = buildGraph(flights); 

        dfs(graph, src, dst, K + 1, 0); 
        return minPathCost == Integer.MAX_VALUE ? -1 : minPathCost;
    }

    private void dfs(Map<Integer, List<int[]>> graph, int src, int dst, int k, int currentCost) {
        if (k < 0) return; 
        if (src == dst) { 
            minPathCost = currentCost;
            return;
        }
        if (!graph.containsKey(src))
            return;
        for (int[] flight : graph.get(src)) {
            if (currentCost + flight[1] > minPathCost) 
                continue;
            dfs(graph, flight[0], dst, k - 1, currentCost + flight[1]);
        }
    }

    private Map<Integer, List<int[]>> buildGraph(int[][] flights) {
        Map<Integer, List<int[]>> graph = new HashMap<>(); 
        for (int[] flight : flights) {
            graph.putIfAbsent(flight[0], new ArrayList<>());
            graph.get(flight[0]).add(new int[]{flight[1], flight[2]});
        }
        return graph;
    }
}
