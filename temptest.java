public class temptest{
	public static void main(String[] args){
		int[] mynums = {33, 20, 19, 67, 8, 4, 1};
		sort(mynums);

		for(int i = 0; i < mynums.length; i++){
			System.out.println(mynums[i]);
		}

	}

	public static void sort(int[] nums){
		for(int i = 1; i < nums.length; i++){
			int element = nums[i];
			int j = i;

			while( j>0 && nums[j-1]>element){
				nums[j] = nums[j-1];
				j--;
			}

			nums[j]= element;
		}
	}
}