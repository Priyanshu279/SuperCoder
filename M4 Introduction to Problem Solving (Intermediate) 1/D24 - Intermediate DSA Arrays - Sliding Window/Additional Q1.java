import java.util.*;

class Main {
    
    public static int leastAvg(int A[],int B){
        int N=A.length;
        float sum=0;
        float avg=0;
        
        for(int i=0;i<B;i++){
            sum=sum+A[i];
        }
        avg=sum/B;
        
        int s=1;
        int e=B;
        int index=0;
        while(e<N){
            sum=sum-A[s-1]+A[e];
            if(avg>(sum/B)){
                avg=sum/B;
                index=s;
            }
            s++;
            e++;
        }
        return index;
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
        
        int ans=leastAvg(A,B);
        System.out.println(ans);
	}
}