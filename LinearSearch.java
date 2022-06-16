import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int n = sc.nextInt();
		
		int array[]=new int[n];
		
		System.out.println("enter elements");
		
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		
		System.out.println("enter key element");
		int key = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			if(array[i]==key) {
				System.out.println("element found");
				return;
			}
		}
		System.out.println("element not found");
		

	}

}
