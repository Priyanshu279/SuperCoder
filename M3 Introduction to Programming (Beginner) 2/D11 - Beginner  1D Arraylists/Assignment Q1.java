import java.util.*;

class Main {
	
	public static int checkNumber(ArrayList<Integer> arr,int x){
		int n=arr.size();
		int ans=0;
		for(int i=0;i<n;i++){
			if(arr.get(i).equals(x)){
				ans=1;
			}
		}
		return ans;
	}
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T>0){
			ArrayList<Integer> A=new ArrayList<Integer>();
			int n=sc.nextInt();
			
			for(int i=0;i<n;i++){
				int val=sc.nextInt();
				A.add(val);
			}
			
			int B=sc.nextInt();
			int result =checkNumber(A,B);
			System.out.println(result);
			T--;
		}
	}
}