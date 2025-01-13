import java.util.*;

public class Main{

    public int countAmazingSubstrings(String S){
        int n = S.length();
        int mod = 10003;
        int count = 0;

        for (int i=0;i<n;i++){
            char c=S.charAt(i);

            if(isVowel(c)){
                count=count+(n-i);
                count=count%mod; 
            }
        }

        return count;
    }
    
    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the string:");
        String S = scanner.nextLine();

        AmazingSubstrings solver = new AmazingSubstrings();

        int result = solver.countAmazingSubstrings(S);
        System.out.println("Number of amazing substrings: " + result);
        
    }
}
