import java.util.Scanner;

public class NumberOfDivisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int count=0;
		
		for(int i=1;i<=num/i;i++) {
			if(num%i==0) {
				if(i==num/i)
					count++;
				else
					count+=2;
			}
		}
		System.out.println(count);
	}

}
