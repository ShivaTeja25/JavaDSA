import java.io.*;
import java.util.*;

public class StringPalindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
       
        StringBuilder s = new StringBuilder(A);
        s.reverse();
        
        String t=s.toString();
        
        if(A.equals(t))
            System.out.println("Yes");
        else
            System.out.println("No");    
        
    }
}



