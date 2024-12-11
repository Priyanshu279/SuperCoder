import java.util.*;

class Main {
	public static int getDecimal(String A){
		int d=0;
		for(int i=0;i<A.length();i++){
			int b=A.charAt(A.length()-1-i)-'0';
			d=d+(b*(int)Math.pow(2,i));
		}
		return d;
	}
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		String A=sc.nextLine();
		int decimal = getDecimal(A);
		System.out.println(decimal);
	}
}