public class extraCharacter{

public static char extraChar(String s1, String s2){

    int sc1=0,sc2=0;

    for(int i=0;i<s1.length();i++){
        int c=s1.charAt(i);
        sc1+=c;
    }

    for(int i=0;i<s2.length();i++){
        int c=s2.charAt(i);
        sc2+=c;
    }

    return ((char)(sc2-sc1));
    
}

}