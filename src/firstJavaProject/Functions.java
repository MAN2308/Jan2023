package firstJavaProject;

import java.util.Scanner;

public class Functions 
{
	// static int totalSum(int a,int b) 
	//{
	//	int sum = a + b;
	//	return sum;
	//}
	
	static int multi(int a, int b) 
	{
		return a * b;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		//int sum = totalSum(a,b);
		
		System.out.println(multi(a,b));

	}

}
