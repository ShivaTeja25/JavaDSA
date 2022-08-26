import java.io.*;
import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        String[] arr = s.trim().split("[!,?._'@\\s]+()");
        System.out.println(arr.length);
        for(String k:arr)
            System.out.println(k);
        
        scan.close();
    }
}
