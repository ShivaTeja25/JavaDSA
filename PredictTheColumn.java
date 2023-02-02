class PredictTheColumn{
    
    static int columnWithMaxZero(int a[][],int n){
        
        // Your code here
        int max=0;
        int arr[]=new int [n];
        int col=0;
        
        for(int i=0; i<n; i++){
            int count=0;
            for(int j=0; j<n; j++){
                if(a[j][i]==0)
                count+=1;
            }
            arr[i]=count;
        }
        
        max = arr[0];
        
        for(int i=0; i<n; i++){
            if(arr[i]>max)
            max = arr[i];
        }
        
        for(int i=0; i<n; i++){
            if(arr[i]==max){
                col=i;
                break;
            }
            
        }
        return col;
        
    }
}