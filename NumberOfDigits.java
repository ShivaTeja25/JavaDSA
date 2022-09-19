import java.util.Scanner;
class NumberOfDigits{	
public static void main(String[] args)
	{     

		Scanner sc = new Scanner(System.in);
		int number=sc.nextInt();
    
		
		int digit = 0;
		while(number != 0)
		{
			
			int pick_last = number % 10;
			digit++;
			number = number / 10;
		}

		
		System.out.print("Number of Digits = "+digit);

	}
}