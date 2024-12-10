import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		String A=sc.nextLine();
		// sc.nextLine();
		int B=sc.nextInt();
		int ans=-1;
		int N=A.length();
		for(int i=N-1;i>=0;i--){
			if(A.charAt(i)==B){
				ans=i;
				break;
			}
		}
			System.out.println(ans);
		}
	}