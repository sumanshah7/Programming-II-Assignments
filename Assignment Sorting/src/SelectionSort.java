/**
 * Author: <Suman Kumar Sah>
 * CS 196
 * Selection sort programming assignment
 */
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SelectionSort {

    /**
     * Generates a random array of ints of length 'size'.
     * Values in the array are between 0 and 100000, inclusive.
     * @param size  the length of the array to create
     * @return      an array of random ints
     */
    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(0, 100000 + 1);
        }
        return array;
    }

    /**
     * Swaps elements at indices a and b.
     * @param array
     * @param a
     * @param b
     */
    private static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    /**
     * Sorts array in non-increasing order with selection sort.
     * @param array  the array to be sorted
     * Sorts array using O(n^2) selection sort.
     */
    private static void reverseSort(int[] array) {
        // TODO - write the code for this method.
        // No credit will be given if you call Java methods.
        // Write your own implementation.
    	/*
    	 * Descending order sorting:
    	 * Max variable is used to store arrays value at index i.
    	 * then compared weather the arrays next element is greater than 
    	 * the value stored in max variable or not.
    	 * if true,then max value will be replaced and swap is performed.
    	 * if false, then max value will be same and compared with 
    	 * the arrays next element and the same process is repeated 
    	 * until its arranged in descending order.
    	 */

    	
		
		for(int i = 0, i_bound = array.length - 1; i < i_bound; i++) {
			int max_index = i, max = array[i];
			for(int j = i+1; j<array.length; j++) {
				if(array[j] > max){
					max_index = j;
					max = array[j];
				}
				
				if (max != i) {
					swap(array, i, max_index);
				}
			}
		}
    }

    /**
     * Sorts array using O(n^2) selection sort.
     * If reversed is true, the array is sorted in non-increasing order
     * (decreasing with potential duplicate values).
     * If reversed is false, the array is sorted in non-decreasing order
     * (increasing with potential duplicate values).
     * @param array  the array to be sorted
     */
    public static void sort(int[] array, boolean reversed) {
        if (reversed) {
            reverseSort(array);
            return;
        }
        for (int i = 0, i_bound = array.length - 1; i < i_bound; i++) {
            int min_index = i, min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min_index = j;
                    min = array[j];
                }
            }
            if (min_index != i) {
                swap(array, i, min_index);
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("How many elements do you want the array to have? ");
        Scanner scanner = new Scanner(System.in);
        int elementCount = 0;
        if (scanner.hasNext()) {
            try {
                elementCount = scanner.nextInt();
                if (elementCount < 0) {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException ime) {
                System.err.println("Error: Invalid input received.");
                System.exit(1);
            } finally {
                scanner.close();
            }
        }
        int[] array = generateRandomArray(elementCount);
        System.out.println("Original: " + Arrays.toString(array));
        sort(array, false);
        System.out.println("Sorted  : " + Arrays.toString(array));
        sort(array, true);
        System.out.println("Reversed: " + Arrays.toString(array));
        System.exit(0);
    }
}