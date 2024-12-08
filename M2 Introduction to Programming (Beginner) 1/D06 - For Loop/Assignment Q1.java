import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		
		for(int T=sc.nextInt();T>0;T--){
			int N=sc.nextInt();
			int firstD;
			for (firstD=N;firstD>=10;firstD=firstD/10) {
    	
			}
			System.out.print(firstD+" "); //first_digit
			System.out.print(N%10);//last_digit
			System.out.println();//new_line
		}
	}
}