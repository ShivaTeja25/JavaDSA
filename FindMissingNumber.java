// Given an array of size N-1 
// such that it only contains distinct integers in the range of 1 to N.
// Find the missing element.

class FindMissingNumber {
    int MissingNumber(int array[], int n) {
        // Your Code Here
        int sum=0;
        for(int i:array)
            sum+=i;
        
        return (n*(n+1))/2 - sum;    
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int range = sc.nextInt();
        int[] array = new int[range-1];
        
        for(int i=0;i<range-1;i++)
            array[i]=sc.nextInt();
            
        System.out.println(MissingNumber(array,range));    
            
        
        
    }
}