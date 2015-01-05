import java.util.Arrays;


public class GuessPositionNumInArray {

	public static void main(String[] args) {

		int[] numArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Pogodi broj: ");
		int num = TextIO.getlnInt();

//		 int numPosition= returnNum(numArray, num);
//		 int numPosition = Arrays.asList(numArray).indexOf(num);
//		 int numPosition = binarySearch(numArray, num);
		 int numPosition = Arrays.binarySearch(numArray, num);
		 
		 if( numPosition==-1){
			 System.out.println("Broj se ne nalazi u ovome nizu.");
		 } else {
			 System.out.printf("Broj se nalazi na poziciji %d u nizu.", numPosition);
		 }
		 
		}

	public static int binarySearch(int[] numArray, int num){
		int startIndex = 0;
		int endIndex = numArray.length -1;
		
		while( startIndex <= endIndex  ){
			int m = ( endIndex +startIndex )/2;
			
			if(numArray[m] == num){
				return m;
			} else if( num < numArray[m]){
				endIndex = m-1;
			} else {
				startIndex = m +1;
			}
		}
		
		return -1;
	}

//	public static int returnNum(int[] numArray, int num) {
//		int i;
//		for (i = 0; i < numArray.length; i++) {
//			if (numArray[i] == num){
//			return i;
//			
//		}
//		return -1;
//	}

}
