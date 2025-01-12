import java.util.*;

class Main {
    public static ArrayList<Integer> leadersInArray(int A[]){
        int N=A.length;
        ArrayList<Integer> leaders=new ArrayList<Integer>();
        int sfXMax=A[N-1];
        for(int i=N-2;i>=0;i--){
            if(A[i]>sfXMax){
                leaders.add(A[i]);
                sfXMax=A[i];
            }
        }
        leaders.add(A[N-1]);
        return leaders;
    }
    
	public static void main(String args[]) {
		// Your code goes here
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int A[]=new int[N];
        
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        
        ArrayList<Integer> ans=new ArrayList<Integer>();
        ans=leadersInArray(A);
        
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
	}
}