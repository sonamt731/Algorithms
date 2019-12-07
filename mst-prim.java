//O(E+VlgV)

MST-Prim(G,w,r){
	for each u in G.V
		u.key = infinity
		u.pi = NIL
}

r.key = 0
Q = G.V

while Q!=empty
	u = extract-min(Q)
	for each v in G.Adj[u]
		if (v in Q and w(u,v) < v.key){
			v.key = w(u,v)
			v.pi = u
		}

	