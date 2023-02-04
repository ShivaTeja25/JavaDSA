class positiveAverage
{
    int posAverage(int numbers[], int size)
    {
        int sum=0,count=0;
        for(int i=0;i<size;i++){
            if(numbers[i]>=0)
            {
                sum+=numbers[i];
                count++;
            }
        }
        int avg=sum/count;
        return avg;
    }
}