import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		String A=sc.nextLine();
		// sc.nextLine();
		int B=sc.nextInt();
		int ans=-1;
		for(int i=0;i<A.length();i++){
			if(A.charAt(i)==B){
				ans=i;
				break;
			}
		}
			System.out.println(ans);
		}
	}