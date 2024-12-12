import java.util.*;

class Main {
	public static String updateString(String A){
		String ans=new String();
		for(int i=0;i<A.length();i++){
			int ch = ((int)(A.charAt(i)) - 96);
			ans=ans+A.charAt(i)+ch;
		}
		return ans;
	}
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		String A=sc.nextLine();
		System.out.println(updateString(A));
	}
}