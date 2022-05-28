import java.io.*;
import java.util.*;

public class maxConsecutiveBits {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int t=sc.nextInt();
        
        while(t>0){
            t--;
            long n = sc.nextLong();
            int count=0,res=0;
            while(n>0){
                if((n&1)==1){
                    count++;
                    if(count>res){
                        res=count;
                    }
                }
                else{
                    count=0;
                }
                n=n/2;
            }
            System.out.println(res);
        }
    }
}