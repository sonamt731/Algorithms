//Huffman Code Section 16.3

//create a tree bottom up 
//runtime nlgn 

//C  is  the set of n characters and each character c element of C is an object with an attribute c.freq

Huffman(C){
	n = |C| 
	Q = C // initialize min priority queue Q with characters in C

	for (i = 1 to n -1 ) //n-1 bc we extract two nodes each time

		allocate a node z
		z.left = x = extract-min(Q);
		z.right = y = extract-min(Q);

		z.freq = x.freq + y.freq;

		Insert(C,z);

	return extract-min(Q); //this will be the head of the tree

}