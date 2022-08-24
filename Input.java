import java.io.*;
import java.util.*;
// read all inputs and display
public class Input {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int i=0;
        String temp;
        while(sc.hasNext()){
            i++;
            temp=sc.nextLine();
            System.out.println(i+" "+temp);
            
        }
    }
}