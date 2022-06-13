import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		if(s1.length()!=s2.length()) {
			System.out.println("Not an Anagram");
		}
		else {
			
			char[] string1=s1.toCharArray();
			char[] string2=s2.toCharArray();
			
			Arrays.sort(string1);
			Arrays.sort(string2);
			
			if(Arrays.equals(string1, string2)) {
				System.out.println("Both are anagram");
			}
			else {
				System.out.println("Not an anagram");
			}
		}
		
	}

}
