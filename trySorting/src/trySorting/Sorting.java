package trySorting;
import java.util.Arrays;

public class Sorting {

		private static void swap(int[] array, int a, int b) {
			int temp = array[a];
			array[a] = array[b];
			array[b] = temp;
		}
		
		public static void bubbleSort(int[] array) {
//			int flag;
			int i;

			
				for(i=0; i<array.length-1;i++) {
//					flag = 0;
					for (int j=0; j < array.length -1 -i; j++) {
						if(array [j] > array[j+1]) {
							swap(array, j+1, j);
//							
							
//							flag = 1;
				}
//			if (flag == 0) return;	
	
			}
		}
		
	}
		
		public static void reverseSelectionSort(int[] array) {
			int i;
			for(i=0; i<array.length-1; i++) {
				int max = i;
				for(int j = i+1; j<array.length; j++) {
					if(array[j] > array[max]) {
						swap(array, max, j);
					}
//					if (max != i)
//						swap(array, max, j);
				}
			}
		}
		
		
		public static void main(String[] args) {
			int[] array = new int[]{5, 4, 1, 3, 6, 2, 9,12, 243};
			int[] array1 = new int[]{4,5,6,7,8,9};
			
			bubbleSort(array);
			System.out.println(Arrays.toString(array));	
//			bubbleSort(array1);
//			System.out.println(Arrays.toString(array1));
			
			reverseSelectionSort(array1);
			System.out.println(Arrays.toString(array1));	
}
}

