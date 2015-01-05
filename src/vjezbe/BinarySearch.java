package vjezbe;

public class BinarySearch {

	public static void main(String[] args) {
		
		int [] nums = new int[]{1,2,3,4,5,6,7,8,9,10};
		System.out.println("Unesi jedan broj: ");
		int num= TextIO.getlnInt();
		
		int searchNum = binarySearchLoop(nums, num);
		
		if ( searchNum == -1){
			System.out.println("Broj se ne nalazi u nizu!");
		} else {
			System.out.printf("Broj se nalazi na poziciji %d.", searchNum);
		}
		
		rekurzijaPrint(nums, num);
		System.out.printf("Suma brojeva od 1 do %d  je %d \n",num, rekurzijaSum(num));;
		
		int searchNumRe = binarySearchRecursive(nums, num, 0, nums.length-1);
		System.out.printf("Broj se nalazi na poziciji %d.", searchNumRe);
	
	}
	
	/**
	 * Recursion for sum of numbers between num and 0.
	 * @param num - number that we enter.
	 * @return sum of numbers from num to zero.
	 */
	private static int rekurzijaSum(int num){
		if( num == 0 ){
			return 0;
		}		
		return num + rekurzijaSum(num-1) ;
	}
	
	/**
	 * Recursion for printing array
	 * @param nums - array of numbers.
	 * @param num  - number that we enter.
	 */
	private static void rekurzijaPrint(int[] nums, int num) {
		if(num < 0)
			return;
		System.out.println( nums[num]);
		num--;
		rekurzijaPrint(nums, num);
		
	}
	
	/**
	 * Binary search with recursion.
	 * @param nums - array of numbers.
	 * @param num - number that we enter.
	 * @param start - start of unsorted array.
	 * @param end - end of unsorted array.
	 * @return index of number that we are searching in array of numbers - 'nums'.
	 */
	private static int binarySearchRecursive(int[] nums, int num, int start, int end){
		if( start >= end){
			return -1;
		}		
		int mid = (start + end)/2;
		
		if (num == nums[mid]){
			return mid;
		} else if (num < nums[mid]) {
			return binarySearchRecursive(nums, num, start, mid);
		} else if( num > nums[mid]){
			return binarySearchRecursive(nums, num, mid+1, end);
		}
		
		return -1;
	}
	
	/**
	 * Binary search with loop while.
	 * @param nums - array of numbers.
	 * @param num - number that we enter.
	 * @return
	 */

	private  static int binarySearchLoop( int [] nums,  int num){
		int startNums = 0;
		int endNums = nums.length -1;

		while ( startNums <= endNums){
			int mid = (startNums + endNums)/2;
//			System.out.printf( "Start: %d End: %d Mid: %d \n", startNums, endNums, mid);
			
			if (num == nums[mid]){
				return mid;
			} else if (num < nums[mid]){
				endNums = mid-1;
			} else if(num > nums[mid]){
				startNums = mid+1;
			} 				
		}	
		return -1;
	}
}
