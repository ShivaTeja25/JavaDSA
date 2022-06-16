import java.util.Scanner;

public class ComputeaPowerb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int base = sc.nextInt();
		int power = sc.nextInt();
		int answer=1,x=base;
		
		while(power!=0) {
			if((power & 1) ==1)
				answer = answer * x;
			x=x*x;
			power = power>>1;
		}
		
		System.out.println(answer);

	}

}
