import java.util.*;

class Main {
	public static boolean  consecutiveDuplicate(ArrayList<Integer> A){
		int size=A.size();
		for(int i=0;i<size-1;i++){
			if(A.get(i)==A.get(i+1)){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> A=new ArrayList<Integer>();
		
		int N=sc.nextInt();
		for(int i=0;i<N;i++){
			int val=sc.nextInt();
			A.add(val);
		}
	
		boolean ans=consecutiveDuplicate(A);
		System.out.println(ans);
		}
	}