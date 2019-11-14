public class fibonacci{
	//O(n)
	public static int fibonacciEfficient(int[] vals, int n){
		if (n<=0){
			return 0;
		}
		else if(n==1){
			return 1;
		}
		else if(vals[n]>0){
			return vals[n];
		}
		else{
			vals[n]=fibonacciEfficient(vals,n-1)+fibonacciEfficient(vals,n-2); //from stored so all O(1)
			return vals[n]; 
		}


	}


	public static void main(String[] args){
		int n = 5;
		int[] values = new int[n+1]; //because we want fib numbers including 5 so we need list of length 6

		for(int i = 0; i<=n; i++){
			System.out.println(fibonacciEfficient(values, i));
		}

	}
}

/* Inefficient would be O(2^n)

public static int fibonacci(int n){
	if (n<=0){
		return 0;
	}
	else if(n==1){
		return 1;
	}
	else{
		return fibonacci(n-1) + fibonacci(n-2);
	}
}

*/