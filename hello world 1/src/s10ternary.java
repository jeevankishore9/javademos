
public class s10ternary {

	public static void main(String[] args) {

		int age = 20;
		
		boolean canDrive = false;
		
		if (age > 18) {
			canDrive = true;
		}else {
			canDrive = false;
		}
		
		canDrive = (age > 18) ? true : false; //ternary
	    
		System.out.println("can drive ? " + canDrive);
		
		
		boolean haslicense = true;
		
		boolean candrive = (age > 18) ? true : false;
		
		boolean canrentacar = candrive ? haslicense ? true : false : false; 
		
		System.out.println("age = " + age);
		System.out.println("has license = " + haslicense);
		System.out.println("can drive ? " + candrive);
		System.out.println("can rent a car ? " + canrentacar);
	}

}
