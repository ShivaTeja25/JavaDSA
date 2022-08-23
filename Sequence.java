import java.util.*;
import java.io.*;
// a,b,n generate series such that
//a+2^0*b,a+2^0*b+2^1*b,........,a+2^0*b+...+2^n-1*b
class Sequence{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum=a;

        for(int j=0;j<n;j++){
            sum+=Math.pow(2,j)*b;
            System.out.print(sum+" ");

        }
        System.out.println();
        }
        in.close();
    }
}
