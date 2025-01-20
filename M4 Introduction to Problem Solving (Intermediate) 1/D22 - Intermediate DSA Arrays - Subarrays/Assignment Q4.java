import java.util.*;

class Main {
    public static ArrayList<Integer> subArrayInRange(int A[], int B, int C){
        ArrayList<Integer> arr=new ArrayList<Integer>();
        
        for(int i=B;i<=C;i++){
            arr.add(A[i]);
        }
        
        return arr;
    }
    
	public static void main(String args[]) {
		// Your code goes here
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int A[]=new int[N];
        
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        
        int B=sc.nextInt();
        int C=sc.nextInt();
        
        ArrayList<Integer> ans=subArrayInRange(A,B,C);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
        
	}
}