package staticbinding;

public class compiletimepolymorphism {

	public static void main(String[] args) {
		compiletimepolymorphism obj = new compiletimepolymorphism();
		obj.add(2, 4);
		obj.add(2, 3, 4);
		obj.add(2.3f, 4.5f);
		
	}
	void add(int a, int b) {
		int result = a + b;
		System.out.println("Result = " + result);	
   }
	void add(float a, float b) {
		float result = a +b;
		System.out.println("Result = " + result);
	}
	void add(int a, int b, int c) {
		int result = a + b + c;
		System.out.println("Result = " + result);	
   }
}


