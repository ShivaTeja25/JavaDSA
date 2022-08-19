import java.util.Scanner;

public class CreateNumber {

	public static void main(String[] args) {
		// Create a number with x setbits followed by y unsetbits
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int number = ((1<<x) - 1) << y;
		
		System.out.println(number);
		

	}

}
