/* Code for the insertion sort
The algorithm divides the list into 2 lists - one being the sorted portion and the other unsorted.
The first element is in the sorted portion and the remaining is compared accordingly.
We are creating empty spots by moving elements in the sorted list portion over.

*/

public class InsertionSort{
	public static void main(String[] args){
		//this code is for testing the insertion sort method below 

		int[] nums = {23, 42, 4, 16, 8, 15};

		insertionSort(nums);

		//output results
		for (int k = 0; k < nums.length; k++){
			System.out.println(nums[k]);
		}
	}

	static void insertionSort(int[] list){
	//starts at 1 bc the sorted portion of the list is the first element 
		for (int i = 1; i < list.length; i++){ 
			int element = list[i];
			int j = i;

			while (j>0 && list[j-1]>element){
				list[j] = list[j-1];
				j -=1;
			}

			list[j] = element;

		}
	}
}