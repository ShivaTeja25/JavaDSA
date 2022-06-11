import java.util.Scanner;

public class DuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		int[] array = new int[n];
		
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(array[i]==array[j])
					System.out.println(array[i]);
			}
		}

	}

}
