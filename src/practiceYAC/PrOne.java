package practiceYAC;

import java.util.Scanner;

public class PrOne
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		int avg = (n1 + n2 +  n3) / 3;
		
		System.out.println("Average of entered 3 numbers are...." + avg );
		

	}

}
