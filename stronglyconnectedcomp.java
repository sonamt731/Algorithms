//O(V+E) runtime
//stronlgy connected component graph is a DAG

call DFS(G) to compute the finishing times u.f for each vertex u
computer G transposed (reverse edges)
call DFS(G^T) but in the main loop of DFS, consider the vertices in order of decreasing u.f
output the vertices of each tree in the depth first forest formed in line 6 as a separate strongly connected component