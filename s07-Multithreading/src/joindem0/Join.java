package joindem0;

import java.util.Scanner;
public class Join extends Thread {
	
	private static int n, sum;

	public static void main(String[] args) {

		System.out.println("Sum of first N numbers");
		System.out.println("Enter a value: ");
		Scanner scanner = new Scanner(System.in);
		Join.n = scanner.nextInt();
		
		Join jd = new Join();
		jd.start();
		
		try {
			jd.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Sum of first " + Join.n + "Number = " + Join.sum);
	}
	@Override
	public void run() { 
		for (int i=1; i<Join.n; i++) {
			Join.sum += i;
		}
	}
	}
	
	

