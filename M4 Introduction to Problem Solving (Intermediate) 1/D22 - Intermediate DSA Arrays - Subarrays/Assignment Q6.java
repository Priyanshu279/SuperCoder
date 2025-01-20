import java.util.*;

class Main {
    
    public static int sumOfAllSubarray(int A[]){
        int N=A.length;
        int totalSum=0;
        for(int i=0;i<N;i++){
            int occ=(i+1)*(N-i);
            int contribution=occ*A[i];
            totalSum=totalSum+contribution;
        }
        return totalSum;
    }
    
	public static void main(String args[]) {
		// Your code goes here
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int A[]=new int[N];
        
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        
        int ans=sumOfAllSubarray(A);
        
        System.out.println(ans);
	}
}