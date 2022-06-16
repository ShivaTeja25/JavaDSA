import java.util.*;
class CheckBit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int number = sc.nextInt();
        int position = sc.nextInt();
       
        if((number>>position & 1) ==1)
           System.out.println("Set Bit");
        else
           System.out.println("Unset Bit");
       
    }
}
