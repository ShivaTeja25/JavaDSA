class QuadProbing{
    
    static void quadraticProbing(int[] hash, int hash_size, int arr[], int N)
    {
         int size=0;

        for(int i=0;i<hash_size;i++)
            hash[i]=-1;

        for(int i=0;i<N;i++)

        {

            int k=arr[i]%hash_size;

            int j=k;

            int x=1;

            while(hash[k]!=-1 && hash[k]!=arr[i])

            {

                k=(arr[i]+(x*x))%hash_size;

                x++;

                if(j==k)

                break;

            }

            if(hash[k]==-1)

            hash[k]=arr[i];

            size++;

        }

    }
            

   
}