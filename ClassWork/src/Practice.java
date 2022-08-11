import java.util.Arrays;

public class Practice {

	public static void mystery(int x) {
		x += 10;
	}
	
	public static void mystery(StringBuilder builder) {
		builder.append("hi");
	}
	
	public static int[] makeArray(int size) {
		int[] array = new int[size];
		for (int i = 0; i< size; i++) {
			array[i] = 7;
		}
		System.out.println(array);
		return array;
	}
	
	public static void main(String[] args) {
		
		int x = 5;
		mystery(x);
		System.out.println(x);
		
		StringBuilder builder = new StringBuilder();
		mystery(builder);
		System.out.println(builder.toString());
		
		int[] array = makeArray(10);
		System.out.println(Arrays.toString(array));
		array[0] = 8;
		System.out.println(Arrays.toString(array));
		System.out.println(array);
	}
}
