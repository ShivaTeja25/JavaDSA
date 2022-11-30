// Recursive approach to check if an
// Array is sorted or not

class CheckIfArrayIsSorted {
	
	static int arraySorted(int arr[], int n)
	{
		if (n == 1 || n == 0)
			return 1;

		if (arr[n - 1] < arr[n - 2])
			return 0;

		return arraySorted(arr, n - 1);
	}

	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
            
		int arr[];
		int n = sc.nextInt();
            for(int i=0;i<n;i++){
               arr[i]=sc.nextInt();
           }

		if (arraySortedOrNot(arr, n) == 0)
			System.out.println("No");
		else
			System.out.println("Yes");
	}
}
