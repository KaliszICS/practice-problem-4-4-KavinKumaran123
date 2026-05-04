public class PracticeProblem {

	public static void main(String args[]) {

	}
}

// Utility Class
class CampbellClass {

	// Private constructor (required)
	private CampbellClass() {
	}

	// convertString (overloaded)
	public static String convertString(int value) {
		return value + "";
	}

	public static String convertString(double value) {
		return value + "";
	}

	public static String convertString(char value) {
		return value + "";
	}

	public static String convertString(boolean value) {
		return value + "";
	}

	// convertMetersToCenti (overloaded)
	public static int convertMetersToCenti(int meters) {
		return meters * 100;
	}

	public static double convertMetersToCenti(double meters) {
		return meters * 100;
	}

	// removeNonAlpha (WITH boolean)
	public static String removeNonAlpha(String str, boolean upper) {
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (Character.isLetter(c)) {
				result += c;
			}
		}

		if (upper) {
			return result.toUpperCase();
		} else {
			return result.toLowerCase();
		}
	}

	// 🔥 FIXED: preserve original case
	public static String removeNonAlpha(String str) {
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (Character.isLetter(c)) {
				result += c;
			}
		}

		return result; // NO case change
	}
}