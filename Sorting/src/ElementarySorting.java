import java.util.Arrays;

public class ElementarySorting {

	private static void swap(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	
	public static void bubbleSort(int[] array) {
		int len = array.length;
		while( len > 0) {
			int n = 0;
			for (int i=1; i < len; i++) {
				if(array [i - 1] > array[i]) {
					swap(array, i - 1, i);
					n = i;
				}
			}
			len = n;
		}
			
	}
	 
	public static void selectionSort(int[] array) {
		for(int i = 0, i_bound = array.length - 1; i < i_bound; i++) {
			int min_index = i, min = array[i];
			for (int j = i + 1; j < array.length; j++) {
				if(array[j] < min) {
					min_index = j;
					min = array[j];
				}
			}
			
			if(min_index != i) {
				swap(array, i, min_index);
			}
		}
	}
	
	public static void insertionSort(int[] array) {
		for(int i = 1; i < array.length; i++) {
			int k, current = array[i];
			for(k = i - 1; k >= 0 && array[k] > current; k--) {
				array[k + 1] = array[k];
			}
			array[k+1] = current;
		}
	}
	
	
	

	
	public static void main(String[] args) {
		int[] array = new int[]{5, 4, 1, 3, 6, 2};
		bubbleSort(array);
		System.out.println(Arrays.toString(array));
		
		int[] array2 = new int[]{5, 4, 1, 3, 6, 2, 7};
		selectionSort(array2);
		System.out.println(Arrays.toString(array2));
		
		int[] array3 = new int[]{5, 4, 1, 3, 6, 2,7, 8};
		insertionSort(array3);
		System.out.println(Arrays.toString(array3));
//	}
}
}
