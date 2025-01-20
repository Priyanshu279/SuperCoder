import java.util.*;

class Main {
    public static int minimumSwaps(int A[],int B){
        int N=A.length;
        int windowLength=0;
        
        for(int i=0;i<N;i++){
            if(A[i]<=B){
                windowLength++;
            }
        }
        
        int count=0;
        for(int i=0;i<windowLength;i++){
            if(A[i]<=B){
                count++;
            }
        }
        
        int swaps=windowLength-count;
        int s=1;
        int e=windowLength;
        
        while(e<N){
            if(A[s-1]<=B){
                count--;
            }
            if(A[e]<=B){
                count++;
            }
            swaps=Math.min(swaps,windowLength-count);
            s++;
            e++;
        }
        return swaps;
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
        
        int ans=minimumSwaps(A,B);
        System.out.println(ans);
        
	}
}