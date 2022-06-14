package telran.validator.tools;

public class Validator {
	public static boolean checkCreditCard(String str) {
		String pattern = "\\d{8,16}";
		return str.matches(pattern);
	}
	public static boolean checkDateFormatEU(String str) {
		String pattern = "(0[1-9]|[1-2]\\d|3[0-1])\\.(0[1-9]|1[0-2])\\.\\d{4}";
		return str.matches(pattern);
	}
	public static boolean checkDateFormatUS(String str) {
		String pattern = "\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[1-2]\\d|3[0-1])";
		return str.matches(pattern);
	}
	public static boolean checkPhoneNumber(String str) {
		String pattern = "\\+\\d{2}\\(\\d{2}\\)\\d{4}-\\d{4}";
		return str.matches(pattern);
	}
	public static boolean checkLessEquals255(String str) {
		String pattern = "([01]\\d{2}|2[0-4]\\d\25[0-5])";
		return str.matches(pattern);
	}
	
}
