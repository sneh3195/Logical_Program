package Logical_Program;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
         
		int count , num1 = 0, num2 = 1;
		
		System.out.println("How many numbers you want in the sequence: ");
		
		Scanner input = new Scanner(System.in);
          count = input.nextInt();
          input.close();
		
  		System.out.println("Fibonacci Series of " +count+" numbers: " );
  		
  		int i=1;
  		while(i<=count) {
  			System.out.println(num1+ " ");
  			int SumOfPrevTwo = num1 + num2;
  			num1 = num2;
  			num2 =SumOfPrevTwo;
  			i++;
  		}

	}

}
