package firstJavaProject;

public class CountVowelsConsonants 
{
	public static void main(String[] args) 
	{
		String str = "Hello World of Java";
		
		int cnt=0;
		int v_cnt=0;
		int c_cnt=0;
		
		str = str.toLowerCase();
		for (int i=0; i<str.length();i++) 
		{
			if(str.charAt(i)!=' ') 
			{
				cnt++;
			}
			if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u') 
			{
				v_cnt++;
			}
			else if (str.charAt(i)>'a' && str.charAt(i)<='z') 
			{ 
				c_cnt++;
			}
		}
		System.out.println("Total Characters in String are....:" + cnt);
		System.out.println("Total Vowels in String are....:" + v_cnt);
		System.out.println("Total Consonant in String are....:" + c_cnt);
	}	
}
