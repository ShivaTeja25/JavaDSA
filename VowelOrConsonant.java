public class VowelOrConsonant
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
 	  

	 char c = sc.nextChar();;

        

        if (isVowel(c))
            System.out.println (c + " is a vowel ");

        else
            System.out.println (c + " is a consonant ");

    }

    
    static boolean isVowel(char c)
    {
        
        c = Character.toUpperCase(c);
    
        
        return (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }

    
}