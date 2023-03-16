class LinearProbing{
    
    int[] linearProbing(int hash_size, int arr[], int sizeOfArray)
    {
       
        int[] h= new int[hash_size];
        for(int i=0;i<hash_size;i++)
            h[i]=-1;
            
        for(int i=0;i<sizeOfArray;i++){
            int key = arr[i]%hash_size;
            int curr = key;
              
              while(h[key]!= -1 && h[key]!=arr[i])
              {
                  key = (key + 1)%hash_size;
                  if(key == curr)
                  break;
              }
              if(h[key] == -1)
              h[key] = arr[i];
          }
         return h;  
                
            
          
        
    }
}