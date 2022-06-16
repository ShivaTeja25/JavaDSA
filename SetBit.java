import java.util.Scanner;

public class SetBit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count =0;
		for(int i=0;i<=31;i++) {
			if((n>>i & 1 )== 1)
				count++;
		}
		System.out.println(count);

	}

}
