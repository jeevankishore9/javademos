
public class s11loop {

	public static void main(String[] args) {

		System.out.println("val - 1");
		System.out.println("val - 2");
		System.out.println("val - 3");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("val : " + i);
		}
		for (int i = 1; i <= 10; i++) {
			System.out.println("val : " + i++);
		}
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.println("*");
			}
			System.out.println();
	}

  }
}
