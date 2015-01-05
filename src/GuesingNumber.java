public class GuesingNumber {
	public static void main(String[] args) {
		/**
		 * Task: Try to guess number form 1 to 100.
		 */

		System.out.println("Pogodi broj od 1 do 100:");
		int num = TextIO.getlnInt();


		int numForGuess = (int) (1 + Math.random() * 100);

		while (num != numForGuess) {
			if (num > numForGuess) {
				System.out.println("Broj je veci od zamisljenog!");
				System.out.println("Unesi novi broj: ");
				num = TextIO.getlnInt();

			} else if (num < numForGuess) {
				System.out.println("Broj je manji od zamisljenog!");
				System.out.println("Unesi novi broj: ");
				num = TextIO.getlnInt();
			}

		}

		if (num == numForGuess) {
			System.out.println("Pogodio si!");
		}

	}
}
