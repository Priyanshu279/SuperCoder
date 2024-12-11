import java.util.*;

class Main {
	public static int product(ArrayList<Integer> A){
		int ans=1;
		int size=A.size();
		for(int i=0;i<size;i++){
			ans=ans*A.get(i);
		}
		return ans;
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
		int p=product(A);
		System.out.println(p);
		}
	}