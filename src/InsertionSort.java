public class InsertionSort {

	public static void main(String[] args) {
		int numbers[] = new int[] { 871, 12, 8, 98, 12, 19, 18, 82, 11, 65, 58,
				78, 45, 36 };
		// insertionSort(numbers);
		bubbleSort(numbers);

		for (int n : numbers) {
			System.out.println(n);
		}
	}

	private static void insertionSort(int[] numbers) {

		for (int i = 0; i < numbers.length; i++) {

			int newPos = i;

			while (newPos > 0 && numbers[newPos - 1] > numbers[newPos]) {
				int t = numbers[newPos - 1];
				numbers[newPos - 1] = numbers[newPos];
				numbers[newPos] = t;
				newPos--;

			}
		}

	}

	public static void bubbleSort(int[] numbers) {
		for (int i = numbers.length - 1; i >= 0; i--) {
			int maxIndex = 0;

			for (int j = 1; j <= i; j++) {
				if (numbers[j] > numbers[maxIndex]) {
					maxIndex = j;
				}
			}

			int t = numbers[i];
			numbers[i] = numbers[maxIndex];
			numbers[maxIndex] = t;
		}
	}
}
