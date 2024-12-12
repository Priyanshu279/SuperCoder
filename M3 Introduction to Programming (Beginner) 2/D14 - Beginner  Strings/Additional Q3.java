import java.util.*;

class Main {
	public static String removeLastChar(String A){
		String ans=new String();
		for(int i=0;i<A.length()-1;i++){
			ans=ans+A.charAt(i);
		}
		return ans;
	}
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		String A=sc.nextLine();
		System.out.println(removeLastChar(A));
	}
}