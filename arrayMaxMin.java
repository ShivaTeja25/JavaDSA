import java.util.Scanner;

public class arrayMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Size of array");
		int n = sc.nextInt();
		
		int[] array = new int[n];
		
		System.out.println("enter elements:");
		
		for(int i=0;i<n;i++)
			array[i]=sc.nextInt();
		
		int min=array[0];
		int max=array[0];
		
		for(int i=1;i<n;i++) {
			if(array[i]>max)
				max=array[i];
			if(array[i]<min)
				min=array[i];
			
		}
		
		System.out.println("The max element is:"+max);
		System.out.println("The min element is:"+min);

	}

}
