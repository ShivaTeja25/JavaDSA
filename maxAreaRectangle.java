class maxAreaRectangle{
    
    static int calculate_Area(Rectangle arr[]){
        
        
        int max=0;
        
        for(int i=0; i<arr.length; i++)
        {
            max=Math.max(max,arr[i].breadth*arr[i].length);
        }
        
        return max;
        
    }
    
}