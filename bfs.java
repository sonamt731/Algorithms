//BFS Code 
frontier = [S]
While fronter ! empty
	next = []
	for u in frontier{
		for v in adj[u]{
			if v.color == white{
				v.color = black
				next.append(v)
			}
		}
	}
	fronter = next


//Time is theta (|V| + |E|)
	

