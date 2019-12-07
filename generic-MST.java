
Generic-MST(G,w)

A=emptyset

//spanning tree is acyclic and connects all vertices with smallest total weights
while A is not a spanning tree
	find (u,v) in E //safe for A
	A = A U {u,v}
return A


//{u,v} is safe if A U {u,v} is also a subset of some MST


