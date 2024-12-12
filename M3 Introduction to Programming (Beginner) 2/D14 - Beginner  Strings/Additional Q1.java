import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		String A=sc.nextLine();
		int counta=0;
		int countp=0;
		int countm=0;
		for(int i=0;i<A.length();i++){
			if(A.charAt(i)=='m'){
				countm++;
			}else if(A.charAt(i)=='p'){
				countp++;
			}else{
				counta++;
			}	
		}
		if(countm==counta+countp){
			System.out.println(1);
		}else{
			System.out.println(0);
		}
	}
}