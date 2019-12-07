//kruskals algorithm qualifies as greedy
//runtime (ElgV)


MST-Kruskal(G,w)

A = empty-set
for each v in V{
	makeset(v) //runs in O(V)
}

for(u,v) in E in nondecreasing order //sort edge in ElgE time
	if (findset(u) != findset(v)) 2|E| x logV = O(ElogV)
		A = A U {u,v}
		union(u,v)

return A