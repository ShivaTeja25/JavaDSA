
import java.util.*;

public class matrixMultiplication {

	public static void main(String[] args) {
		
	  Scanner sc = new Scanner(System.in);
	  
	  
	  
	  System.out.println("enter no of rows and columns in first matrix");
	  
	  int r1 = sc.nextInt();
	  int c1 = sc.nextInt();
	  
	  System.out.println("enter no of rows and columns in second matrix");
	  
	  int r2 = sc.nextInt();
	  int c2 = sc.nextInt();
	  
	  int[][] matrix1 = new int[r1][c1]; 
	  
	  int[][] matrix2 = new int[r2][c2];
	  
	  System.out.println("enter first matrix");
	  for(int i =0;i<r1;i++) {
		  for(int j=0;j<c1;j++) {
			 matrix1[i][j] = sc.nextInt();
		  }
	  }
	  
	  System.out.println("enter second matrix");
	  for(int i =0;i<r2;i++) {
		  for(int j=0;j<c2;j++) {
			 matrix2[i][j] = sc.nextInt();
		  }
	  }
	  
	  
	  if(c1==r2) {
		  int[][] result = new int[c1][r2];
		  
		  for(int i=0;i<r1;i++) {
			  for(int j=0;j<c2;j++) {
				  
				  for(int k=0;k<c1;k++) {
					  result[i][j] += matrix1[i][k]*matrix2[k][j];
				  }
			  }
		  }
		  
		  System.out.println("The Resultant matrix is :");
		  for(int i =0;i<r1;i++) {
			  for(int j=0;j<c2;j++) {
				  System.out.print(result[i][j]+" ");
			  }
			  System.out.println();
		  }
	  }
	  else
		  System.out.println("Multiplication not possible");
	  
	}

}
