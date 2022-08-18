import java.util.Scanner;

public class PositionedSetBits {

	public static void main(String[] args) {
		// Create a number with given positions as SETBITS
		
		Scanner sc = new Scanner(System.in);
		
		int pos1=sc.nextInt();
		int pos2 = sc.nextInt();
		
		int number = 1<<pos1|1<<pos2;
		
		System.out.println(number);

	}

}
