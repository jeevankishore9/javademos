
public class printevennumusingforloop {

	public static void main(String[] args) {

		for (int i = 22; i <= 98; i++) {
			if (i % 2 == 0) {
		System.out.println("Even Number: " + i);
	 }
   }
		for (int i = 22; i <= 98; i += 2) { //other method
			System.out.println(i);
		}
		
		// find the sum of all the numb divided by 3 and 5 between 1to 100
		// sum only 1st 5 numbers
		int sum = 0;
		int count = 0;
		for (int i = 1; i< 100; i++) {
			if ( (i % 3 == 0) && (i % 5 ==0)) {
				sum += i;
				count++;	
			}
			if (count == 5) {
				break;
			}else {
				continue;
			}
		}
		}
}