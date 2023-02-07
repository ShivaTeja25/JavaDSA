class recursiveSum
{
    
    public static int recursiveSum(int N)
    {
        if(N==0)
            return 0;
        return N + recursiveSum(N-1);    
    }
}