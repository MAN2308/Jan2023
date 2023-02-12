package firstJavaProject;

public class test {

	public static void main(String[] args)
	{
		child c = new child();
		c.div();
		c.mul();
		c.add();
		c.sub();
		
		parent p = new parent();
		p.add();
		p.sub();
		
		parent p1 = new child();
		p1.add();
		p1.sub();
		
		//child c1 = new parent();
		
		

	}

}
