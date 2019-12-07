//topological sort

topologicalsort(G)

call DFS(G) to compute finishing times v.f for each vertex v
as each vertex is finished insert to front of linked list //decreasing order of finishing times
return the linked list of vertices 


O(V+E)