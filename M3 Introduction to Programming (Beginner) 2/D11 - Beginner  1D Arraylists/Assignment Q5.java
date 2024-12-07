import java.util.*;

class Main {
	
	public static int findUnique(ArrayList<Integer> arr){
		int n=arr.size();
		int ans=0;
		for(int i=0;i<n;i++){
			int cnt=0;
			for(int j=0;j<n;j++){
				if(arr.get(i).equals(arr.get(j))){
					cnt++;
				}
			}
			if(cnt==1){
				ans=arr.get(i);
				break;
			}
		}
		return ans;
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
		
		int ans=findUnique(A);
		System.out.println(ans);
	}
}