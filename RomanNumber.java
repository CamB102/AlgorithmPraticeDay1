package algorithmday1;

public class RomanNumber {

	public static void main(String[] args) {
		String romanNumber = "MCMXCIV";

		int equivalentNumber = romanToInt(romanNumber);
		System.out.println("The equilvalent number of " + romanNumber + " is " + equivalentNumber);

	}

	public static int romanToInt(String string) {
		int result = 0;
		int preValue = 0;

		for (int i = string.length() - 1; i >= 0; i--) {
			char c = string.charAt(i);
			int curValue = 0;

			switch (c) {
			case 'I':
				curValue = 1;
				break;
			case 'V':
				curValue = 5;
				break;
			case 'X':
				curValue = 10;
				break;
			case 'L':
				curValue = 50;
				break;
			case 'C':
				curValue = 100;
				break;
			case 'D':
				curValue = 500;
				break;
			case 'M':
				curValue = 1000;
				break;
			}

			if (curValue <= preValue) {
				result -= curValue;
			} else {
				result += curValue;
			}

			preValue = curValue;

		}
		return result;

	}
}
