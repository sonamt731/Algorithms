//efficient power function 
class powerfunct{
	public static void main(String[] args){
		System.out.println(power(2,3));
		System.out.println(power(4,8));
	}


	public static int power(int num1, int n){
		if(n==0){ //base case - anything to the power of 0 is 1
			return 1;
		}

		if(n%2==0){ //even power
			int temp = power(num1, n/2);
			return temp*temp;
		}

		else{ //case of odd power
			int temp = power(num1, n/2);
			return temp * temp * num1;
		}

	}
}

//runs in theta log n time --> recurrence relation T(n) = T(n/2)+c