import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		String A=sc.nextLine();
		int cntAlphabet=0;
		int cntDigits=0;
		
		for(int i=0;i<A.length();i++){
			if(
				(A.charAt(i)>='a' && A.charAt(i)<='z') ||
				(A.charAt(i)>='A' && A.charAt(i)<='Z')
			){
				cntAlphabet++;
			}else if(A.charAt(i)>='0' && A.charAt(i)<='9'){
				cntDigits++;
			}
		}
		if(cntAlphabet>cntDigits){
			System.out.println(cntAlphabet);
		}else{
			System.out.println(cntDigits);
		}
	}
}