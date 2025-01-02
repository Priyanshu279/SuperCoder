import java.util.*;

class Main {
	public static ArrayList<Integer> leadersInArray(int A[]){
		int N=A.length;
		ArrayList<Integer> ans=new ArrayList<Integer>();
		
		for(int i=0;i<N-1;i++){
			int max=A[i+1];
			for(int j=i+1;j<N;j++){
				if(A[j]>max){
					max=A[j];
				}
			}
			
			if(A[i]>max){
				ans.add(A[i]);
			}
		}
		ans.add(A[N-1]);
		return ans;
	}
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		
		for(int i=0;i<N;i++){
			arr[i]=sc.nextInt();
		}
		ArrayList<Integer> ans=new ArrayList<Integer>();
		ans=leadersInArray(arr);
		for(int i=0;i<ans.size();i++){
			System.out.print(ans.get(i)+" ");
		}
	}
}