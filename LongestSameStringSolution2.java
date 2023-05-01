package algorithmday1;

public class LongestSameStringSolution2 {
	// using indexOf
	// Horizontal scanning, compare the first String with the next one, and so on.

	public static void main(String[] args) {
		String[] strs = { "flower", "flow", "flight" };

		String result = getLongestSameString(strs);

		System.out.println("Longest Same String: " + result);

	}
	// big0 = n*m , n: number of string, m : length of the shortest string

	public static String getLongestSameString(String[] array) {
		if (array == null || array.length == 0) {
			return "";

		}
		String longestPrefix = array[0];

		for (int i = 1; i < array.length; i++) {

			while (array[i].indexOf(longestPrefix) != 0) {
				longestPrefix = longestPrefix.substring(0, longestPrefix.length() - 1);

				if (longestPrefix.isEmpty()) {
					return "";
				}

			}
		}
		return longestPrefix;
	}

}
