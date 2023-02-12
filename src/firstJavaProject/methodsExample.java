package firstJavaProject;

public class methodsExample 
{
	public static void main(String[] args) 
	{
		methodsExample me = new methodsExample();
		me.addMe();
		me.addMe(100, 200);
		int z = me.addMe(123, 2, 345);
		if (z>500) 
		{
			System.out.println("z is >500 " + z);		
		}else 
		{
			System.out.println("z is <500 " + z);
		}
	}
	
	public void addMe() 
	{
		int a=10;
		int b=20;
		int c;
		c = a+b;
		System.out.println("Sum of a+b= " + c);		
	}
	public void addMe(int a , int b) 
	{		
		int c=a+b;
		System.out.println("Sum of a+b= " + c);		
	}
	public int addMe(int a ,int b,int c) 
	{		
		int d = a+b+c;
		System.out.println("Sum of a+b+c= " + d);
		return d;		
	}
}
