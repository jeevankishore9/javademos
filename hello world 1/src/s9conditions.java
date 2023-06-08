
public class s9conditions {

	public static void main(String[] args) {

		boolean isAlien = false; 
		
		if (isAlien) {
		
			System.out.println("It is an alien"); 
		}  
		if (!isAlien) {
			System.out.println("it is not an alien");
		}
		
		String name = "max";
		if (name == "max") { 
			System.out.println("correct name"); 
		} 
		
		boolean x = true; 
		boolean y = false; 
		
		if (x && y) { 
			System.out.println("Both the conditions are true"); 
		}else if (x) { 
			System.out.println("Only x is true"); 
		}else { 
			System.out.println("Only y is true");
		} 
		
		int a = 10; 
		int b = 5; 
		int c = 20; 
		
		System.out.println("a < b = " + (a<b)); 
		System.out.println("a < b and a < c = " + (a<b && a<c)); 
		System.out.println("a < b and a < c = " + (a<b & a<c)); 
		
		System.out.println("a < b and a < c = " + (a<b && ++a<c)); 
		 
		System.out.println(" A after logical and = " +a);
		
		System.out.println("a < b and a < c = " + (a<b & ++a<c)); 
		System.out.println(" A after bitwise and = " +a); 
		
		boolean mybool = false;
		if (mybool=false) { 
			System.out.println("x"); 
		}else {
			System.out.println("y"); 
		}
		System.out.println("value: " + (mybool=false));
	}

}
