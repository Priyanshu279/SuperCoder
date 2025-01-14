import java.util.*;

class Main {
    public static String evenSubArray(int A[]){
        int N=A.length;
        
        if(N%2==0 && A[0]%2==0 && A[N-1]%2==0){
            return "YES";
        }
        
        return "NO";
    }
    
	public static void main(String args[]) {
		// Your code goes here
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int A[]=new int[N];
        
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        
        System.out.println(evenSubArray(A));
	}
}