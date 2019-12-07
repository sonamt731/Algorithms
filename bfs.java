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
	

//BFS from the textbook is better

BFS(G,s) //s is the head

for each u in G.V - {s} //minus vertex s
	u.color = white; //undiscovered
	u.pi = nil; //no parent yet
	u.d = infinity; //level

s.d = 1; //first level
s.pi = nil; //no parent
s.color = grey;

Q=empty; 
enqueue(Q,s); 

while (Q!= empty){
	u = dequeue(Q);
	for v in Adj[u]{
		if(v.color == white){ //if it undiscovered
			v.color = grey;
			v.d = u.d + 1; //level
			v.pi = u; //parent that discovered it
			enqueue(Q,v)
		}
	}

	u.color = black; //finished exploring neighbors 
}
