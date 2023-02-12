package firstJavaProject;

public class ArrayReverse 
{
	public static void main(String[] args) 
	{
		int a[] = new int[] {1,2,3,4,5};
		System.out.println("Original array is....: ");
		for (int i=0; i<a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Reverse array is.....: ");
		for (int j=a.length-1;j>=0; j--) 
		{
			System.out.print(a[j]+" ");
		}
	}
}
