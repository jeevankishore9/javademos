
public class s1staticblocktest {

	public static void main(String[] args) {

		System.out.println("inside main method");	
	}
	
	static {
		System.out.println("Static block 2");
	}
	static {
		System.out.println("Static block 1");
	}
	

}
