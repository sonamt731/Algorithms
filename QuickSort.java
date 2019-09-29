public class QuickSort{
	public static void main(String[] args){
		int[] mynums = {1,15,2,3,4,8,12,11,10,9,5,18};
		quicksort(mynums);
	}


public void quicksort(int[] arr, int left, int right){
	int index = partition(arr, left, right);
	if(left<index-1){ //sort left half
		quicksort(arr, left, index-1);
	}
	if(index<-right){
		quicksort(arr, index, right);
	}
}

int partition(int[] arr, int left, int right){
	int pivot = arr[left + (right -left)/2]; //pick pivot point
	while(left<=right){
		while(arr[left]<pivot){
			left++;
		}

		while(arr[right]>pivot){
			right--;
		}

		if(left <= right){
			swap(arr, left, right);
			left++;
			right--;
		}
	}

	return left;

}
}
	
