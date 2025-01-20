import java.util.*;

class Main {
    public static int subarrayOfLengthBandSumC(int A[],int B,int C){
        int N=A.length;
        int sum=0;
        
        for(int i=0;i<B;i++){
            sum=sum+A[i];
        }
        if(sum==C){
            return 1;
        }
        
        int s=1;
        int e=B;
        
        while(e<N){
            sum=sum-A[s-1]+A[e];
            if(sum==C){
                return 1;
            }
            s++;
            e++;
        }
        return 0;
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
        
        int ans=subarrayOfLengthBandSumC(A,B,C);
        System.out.println(ans);
        
	}
}