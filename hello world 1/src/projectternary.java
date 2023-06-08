
public class projectternary {

	public static void main(String[] args) {

		int age = 15;
		
        boolean Houseavailable = true;
		
		boolean loanagree = (age > 18) ? true : false;
		
		boolean buyhouse = Houseavailable ? (loanagree ? true : false) : false; 
		
		System.out.println("age = " + age);
		System.out.println("house availabe = " + Houseavailable);
		System.out.println("loan agree ? " + loanagree);
		System.out.println("can buy A housE ? " + buyhouse);
	}

}
