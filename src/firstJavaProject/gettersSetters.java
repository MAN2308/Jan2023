package firstJavaProject;

public class gettersSetters 
{
	String name;
	int age;
	public static void main(String[] args) 
	{
		gettersSetters gs = new gettersSetters();	
		gs.setName("Abcd");
		gs.setAge(34);
		System.out.println(gs.getName());
		System.out.println(gs.getAge());
		gs.printDetails();
	}	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public void printDetails()
	{
		System.out.println(getName() + " , " + getAge());
	}
}
