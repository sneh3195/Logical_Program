package Logical_Program;

import java.util.Scanner;

public class PerfectNumber {
	static long isPerfect(long num)  
	{  
	long sum=0;  
	for(int i=1; i <= num/2; i++)  
	{  
	if(num % i == 0)  
	{  
	sum=sum + i;  
	}   
	} return sum;   
	}

	public static void main(String[] args) {
		long number, sum;  
		Scanner input=new Scanner(System.in);         
		System.out.print("Enter the number: ");  
		number=input.nextLong();  
		sum = isPerfect(number);  
		if(sum==number)  
		System.out.println(number+" is a perfect number");  
		else  
		System.out.println(number+" is not a perfect number");   
	}

}
