//DFS
//graph g

DFS(G)
time = 0
for u in V
	u.color = white
	u.parent = nil

for u in V
	if u.color == white
		DFS-visit(G,u)


DFS-visit(G,u){
	time +=1
	u.d = time
	u.color = gray
	for v in Adj[u]{
		if v.color == white
			v.parent = u
			DFS-visit(G,v)
	}
	u.color = black
	time+=1
	u.f= time
}