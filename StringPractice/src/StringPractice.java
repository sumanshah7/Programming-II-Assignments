
public class StringPractice {
	
	public static String reverse(String s) {
		
		int len = s.length();
		StringBuilder builder = new StringBuilder(len);
		
		for (int i = len -1; i >= 0  ;i--) {
			builder.append(s.charAt(i));
		}
		return builder.toString();
		
	}
	
	
	public static boolean isPasswordValid(String password) {
		
	String sc = "Suman";
	
	if(password == sc ) {
		return true;
	}else {
		return false;
	}
		
	}
	
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		
		str.append("We sold ");
		str.append(12);
		str.append(" doughnuts for $");
		str.append(15.95);
		
		System.out.println(str);
		
		str.delete(0,  8);
	}

}
