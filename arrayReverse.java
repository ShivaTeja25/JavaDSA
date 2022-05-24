import java.util.Scanner;

public class arrayReverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n = sc.nextInt();
		int[] array = new int[n];
		
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		int temp;
		for(int i=0;i<n/2;i++) {
			temp = array[i];
			array[i]=array[n-1-i];
			array[n-1-i]=temp;
		}
		System.out.println("Reversed array is:");
		for(int i=0;i<n;i++) {
			System.out.println(array[i]+" ");
		}
		

	}

}
