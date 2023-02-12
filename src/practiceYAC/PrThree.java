package practiceYAC;

import java.util.Scanner;

public class PrThree
{
	//static int grNum(int n1 , int n2) 
	//{
	//	if (n1 >n2) 
	//	{
	//		return n1;
	//	}
	//		else
	//	{
	//		return n2;
	//	}
	//}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if (n1 > n2) 
		{
			System.out.println("Greater number is " + n1);
		}else
		{
			System.out.println("Greater number is...." + n2);
		}
		
		//System.out.println("Greator number is : " + grNum(n2,n1));

	}

}
