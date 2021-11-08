package Logical_Program;

import java.util.Scanner;

public class ReverseNumber {

	public static void reverseNumber(int number) {
		if(number<10) {
			System.out.println(number);
			return;
		}else {
			System.out.println(number%10);
			reverseNumber(number/10);
		}
	}
	
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);  
	       System.out.print("Enter a number that you want to reverse : ");  
	       int num = input.nextInt();  
	       System.out.println("the reverse of given nmber is: ");
	       reverseNumber(num);
	}

}
