import java.util.Scanner;

public class SingleDuplicateElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		int[] array = new int[size];
		
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		
		int answer=0;
		
		for(int i=0;i<size;i++) {
			answer = answer^array[i];
		}
		System.out.println(answer);
		
		

	}

}
