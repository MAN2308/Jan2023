package Match;

public class CrkMath implements MatchResult {

	@Override
	public void reultM(String str) {
		// TODO Auto-generated method stub
		
		System.out.println("Won==>"+str);
		
	}
	
	public static void main(String args[]) {
		CrkMath c1 = new CrkMath();
		c1.reultM("INDIA");
	}
}
