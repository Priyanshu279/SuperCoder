import java.util.*;

class Main {
	public static int countPair(ArrayList<Integer> A,int B){
		int ans=0;
		int size=A.size();
		for(int i=0;i<size-1;i++){
			for(int j=i+1;j<size;j++){
				int x=A.get(i);
				int y=A.get(j);
				if(x+y==B){
					ans++;
				}
			}
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
		int B=sc.nextInt();
		
		int cnt=countPair(A,B);
		System.out.println(cnt);
		}
	}