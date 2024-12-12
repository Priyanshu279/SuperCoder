import java.util.*;

class Main {

	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T>0){
		String str=sc.next();
		int cntV=0;
		int cntC=0;
		for(int i=0;i<str.length();i++){
		    if(str.charAt(i) == 'a' || str.charAt(i) == 'e'|| str.charAt(i) == 'i'|| str.charAt(i) == 'o' || str.charAt(i) == 'u'){
				cntV++;
			}else{
				cntC++;
			}
		}
		System.out.println(cntV+" "+cntC);
		T--;
		}
	}
}