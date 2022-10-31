import java.util.Scanner;
public class PyramidPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int lines=sc.nextInt();
		 for (int i=0; i<lines; i++) 
	        { 
	            for (int j=lines-i; j>1; j--) 
	                System.out.print(" "); 
	            for (int j=0; j<=i; j++ ) 
	                System.out.print(" *"); 
	            System.out.println(); 
	        } 
	}

}