/**
 * @author Suman_Kumar_Sah.
 * Recursion programming assignment
 * CS 196
 */
public class Recursion {

    /**
     * Returns the value of x * y, computed via recursive addition.
     * x is added y times.
     * @param x  integer multiplicand 1
     * @param y  integer multiplicand 2
     * @return   x * y
     */
    public static int recursiveMultiplication(int x, int y) {
        if(y==0) { //base case
        	return 0;
        }
        return recursiveMultiplication(x,y-1)+x; //Recursion
    }

    /**
     * Reverses a string via recursion.
     * @param s  the non-null string to reverse
     * @return   a new string with the characters in reverse order
     */
    public static String reverse(String s) {
    	//Checks for the empty String
    	if(s=="") {
    		return "";
    	}
    	if(s.length()==1) {
    		return s;
    	}
    	return (reverse(s.substring(1))+ s.charAt(0)); //Recursion
    }

    //Max Helper Method
    private static int maxHelper(int[] array, int index, int max) {
    	if(index == array.length) {
    		return max;
    	}
        if(array[index] > max) {
        	max=array[index]; //Recursion
        }
        index++;
        return maxHelper(array,index,max); //Recursion
    }

    /**
     * Returns the maximum value in the array.
     * Uses a helper method to do the recursion.
     * @param array  the array of integers to traverse
     * @return       the maximum value in the array
     */
    public static int max(int[] array) {
        return maxHelper(array, 0, Integer.MIN_VALUE);
    }

    /**
     * Returns whether or not a string is a palindrome, a string that is
     * the same both forward and backward.
     * @param s  the string to process
     * @return   a boolean indicating if the string is a palindrome
     */
    public static boolean isPalindrome(String s) {        
    	return (s.equals(reverse(s))); //Recursion
    }

    //Member Helper method
    private static boolean memberHelper(int key, int[] array, int index) {
        if(array.length == index) {
        	return false;
        }
    	if(key==array[index]) {
        	return true;
        }
    	index++;
    	return memberHelper(key,array,index); //Recursion
    }

    /**
     * Returns whether or not the integer key is in the array of integers.
     * Uses a helper method to do the recursion.
     * @param key    the value to seek
     * @param array  the array to traverse
     * @return       a boolean indicating if the key is found in the array
     */
    public static boolean isMember(int key, int[] array) {
        return memberHelper(key, array, 0);
    }
}
