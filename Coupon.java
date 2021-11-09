import java.util.Arrays;
import java.util.Scanner;

public class Coupon {

	public static int random() {
		return (int)(1000.0 * Math.random() );
	}
	
	public static void check() {
		Scanner scan = new Scanner(System.in);
		int val, count = 0, flag = 0, iterations = 0;
		System.out.print(" Please enter the number of distinct values to be genrated: ");
		int n = scan.nextInt();
		
		int[] array = new int[n];
		Arrays.fill(array, -1);

		while (count < n) {
			val = random();
			System.out.print("\n\n checking " + val);
			for (int i = 0; i < count; i++) {
				if (array[i] == val) {
					System.out.print(" already used ");
					flag = 1;
					break;
				}
			}
			
			if (flag == 0) 
				array[count++] = val;
			
			flag = 0;
			
			System.out.println("\n ====Current array===");
			for (int i = 0; i < count; i++) {
				System.out.print(" " + array[i]);
			}
			iterations++;
		}
		
		System.out.println("\n We took a total of " + iterations + " iterations");
		scan.close();
	
