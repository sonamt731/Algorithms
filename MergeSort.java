//merge sort
//Runs in O(nlogn) runtime average and worst case 


public class Sorting{
	public static void main(String[] args){
		int[] mynums = {30, 40, 56, 91, 29, 8, 9, 97, 53, 21, 6};
		mergesort(mynums, 0, 10);

		for(int i = 0; i < mynums.length; i++){
			System.out.println(mynums[i]);
		}
	}

	public static void merge(int[] mynums, int l, int m, int r){
		int i, j, k;
		int num1 = m - l + 1; //length plus one to include middle element 
		int num2 = r - m;

		int[] list1 = new int[num1];
		int[] list2 = new int[num2];


		for(i = 0; i<num1; i++){
			list1[i] = mynums[l+i];
		}

		for(j = 0; j<num2; j++){
			list2[j]= mynums[j+m+1];
		}

		//now combine the two lists
		i = 0;
		j=0;
		k = l; //DONT FORGET THIS STEP
		while (i < num1 && j < num2){
			if (list1[i]<= list2[j]){
				mynums[k] = list1[i];
				k++;
				i++;
			}
			else{
				mynums[k] = list2[j];
				k++;
				j++;
			}
		}

		//copy over the rest of the lists
		while (i<num1){
			mynums[k] = list1[i];
			k++;
			i++;
		}

		while(j<num2){
			mynums[k] = list2[j];
			j++;
			k++;
		}


	}

	public static void mergesort(int[] mynums, int l, int r){

		if (l<r){
			int m = (l + r)/2;

			mergesort(mynums, l, m);
			mergesort(mynums, m+1, r);
			merge(mynums, l, m, r);
		}
	}

	
}