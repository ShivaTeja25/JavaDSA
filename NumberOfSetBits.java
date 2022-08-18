import java.util.Scanner;

public class NumberOfSetBits {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int count=0;
		
		//Number of set bits in N & N-1 is one less than number of set bits in N
		while(number!=0) {
			number=number & (number-1);
			count++;
		}
		System.out.println(count);

	}

}
