import java.util.*;

class Main {
	
	public static int checkSorting(ArrayList<Integer> arr){
		int n=arr.size();
		for(int i=0;i<n-1;i++){
			if(arr.get(i)>arr.get(i+1)){
				return 0;
			}
		}
		return 1;
	}
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> A=new ArrayList<Integer>();
		
		int n=sc.nextInt();
        for(int i=0;i<n;i++){
			int val=sc.nextInt();
			A.add(val);
		}
		
		int ans=checkSorting(A);
		System.out.println(ans);
	}
}