static int distinct(int arr[], int n) {
    
    if(n==0) 
        return 0;
    int unique=1, j=0;
    for(int i=1; i<n ; i++)
     {
         for(j=0; j<i ; j++)
          {
              if(arr[i]==arr[j])
               break;
          }
            if(j==i)
          unique++;
     }
     return unique;
}