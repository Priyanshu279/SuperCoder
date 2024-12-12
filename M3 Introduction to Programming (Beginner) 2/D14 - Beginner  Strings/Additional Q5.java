import java.util.*;

class Main {

	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		String S=sc.next();
        String s=new String();
		for(int i=0;i<S.length();i++){
            if(S.charAt(i)>=65 && S.charAt(i)<=90){
                char ch=(char)(S.charAt(i)+32);
		        s=s+ch;
                
            }else{
                System.out.println("Invalid string input");
                return;
            }
		}
		System.out.println(s);
	}
}