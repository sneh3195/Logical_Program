import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 0;
		
		System.out.print(" Enter some input to start: ");
		scan.next();		
		long start = System.nanoTime();
		long end = 0;
		while (n != 1) {
			System.out.print(" Please enter 1 to stop: ");
			n = scan.nextInt();			
			switch (n) {
				case 1: 
					end = System.nanoTime();
					break;
			}
		}
		
		System.out.println(" The total time is: " + ((end - start) * Math.pow(10, -9)) );
		scan.close();
	}
}
