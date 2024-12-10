import java.util.*;

class Main {
	public static String solve(String A){
		String S="";
		for(int i=0;i<A.length();i++){
			char ch=A.charAt(i);
			if(ch>='a'&& ch<='z'){
				ch=(char)(ch-32);
			}
			S=S+ch;
		}
		return S;
	}
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(solve(s));
	}
}