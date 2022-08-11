
public class enhancedLoop {

	public static void main(String[] args) {
		
		int a[] = {1, 2, 3, 4, 5,6};
		int b[] = {1, 2, 3, 4};
		int total = 0;
		int total1 =5;
		
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		
		for(int k: a) {
			System.out.println(k); 
		}
		
		for(int j: a) {
			total += j;
			}
		
		
		for(int f: b) {
			total1 += f;
			}

		System.out.println(total);
		System.out.println(total1);
	}

}
