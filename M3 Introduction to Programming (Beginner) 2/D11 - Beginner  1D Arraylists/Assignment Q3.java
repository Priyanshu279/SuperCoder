import java.util.*;

class Main {
	
	public static int freqX(ArrayList<Integer> arr,int x){
		int n=arr.size();
		int count=0;
		for(int i=0;i<n;i++){
			if(arr.get(i).equals(x)){
				count++;
			}
		}
		return count;
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
		
		int B=sc.nextInt();
		int ans=freqX(A,B);
		System.out.println(ans);
	}
}