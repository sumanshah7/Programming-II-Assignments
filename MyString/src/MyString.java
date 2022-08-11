
public class MyString {
	
	
	

	public static void main(String[] args) {
		String s = new String("My name is Suman");
		System.out.println("Total number of words is "+ wordCount(s));
		char[] ch = {'h','e','l','l','o',' ','w','o','r','l','d'};
		System.out.println("The char are " + arrayToString(ch));
		String su = "hohefleeh";
		System.out.println("The most frequent character is " + mostFrequentChar(su));
		String input = new String("My favourite movie is Avangers.");
		String find = new String("Avangers");
//		String replace = new String("Ironman");
//		System.out.println(" Replaced: " + replaceSubstring(input, find, replace));
	}
	
	
	
	/**
     * Accepts a reference to a String object as an argument
     * and returns the number of words contained in the String.
     * Words are any sequence of characters separated by one or
     * more whitespace characters ['\n', '\t', or ' '].
     * @param s a String
     * @return  the number of words in the String
     */
    public static int wordCount(String s) {
    	String[] word = s.split(" ");
    	return word.length;
      
    }

    /**
     * Accepts a char array as an argument and converts it to a
     * String object. The method should return a reference to the
     * String object.
     * @param charArray an array of characters
     * @return          a String containing the characters found in
     *                  the array
     */
    public static String arrayToString(char[] charArray) {
    	String str = new String(charArray);
        return str;
    }

    /**
     * Accepts a reference to a String object as an argument and
     * returns the character that occurs the most frequently in the
     * String. ASCII characters 0 through 127 are valid inputs.
     * If there is a tie for the most frequent character, return
     * the character with the lowest ASCII value.
     * See: https://www.asciitable.com/
     * The non-null String will have at least length 1.
     * @param s a String
     * @return  the character occurring the most frequently
     */
    public static char mostFrequentChar(String s) {
    	
      int[] ch = new int[127];
      for(int i = 0; i<s.length(); i++) {
    	  ch[s.charAt(i)] = ch[s.charAt(i)] + 1;
      }
      int max = -1;
      char c = ' ';
      for(int i = 0; i<s.length(); i++) {
    	  if(max<ch[s.charAt(i)]) {
    		  max = ch[s.charAt(i)];
    		  c = s.charAt(i);
    	  }
      }
	return c;       
    }

    /**
     * Accepts three references to String objects as arguments.
     * It searches String input for all occurrences of String find
     * and replaces them with String replace.
     * @param input   the input String
     * @param find    the substring to find
     * @param replace the substring to replace where find occurs
     * @return
     */
//    public static String replaceSubstring(String input, String find, String replace) {
////    	String[] sen = input.split(" ");
////    	String s = new String("");
////    	for(int i=0; i<sen.length;i++) {
////    		if(sen[i].equals(find)) {
////    			s = s + replace;
//    	
////    		}
////    		else {
////    			s = s + sen[i];
////    		}
////    		s = s + " ";
////    	}
////    	return s;
////    	String r;
////    	for(int i=0;i < string1.length(); i++) {
//    		
//    	}
    }




