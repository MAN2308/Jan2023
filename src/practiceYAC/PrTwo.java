package practiceYAC;

import java.util.Scanner;

public class PrTwo 
{
	static void oddSum(int n1) 
	{
		int n = 0;
		for (int i=1; i<= n1; i++) 
		{
			if (i% 2 !=0) 
			{
				n = n + i;
			}
		}
		System.out.println(n);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();	
		
		oddSum(n1);
	}
}
