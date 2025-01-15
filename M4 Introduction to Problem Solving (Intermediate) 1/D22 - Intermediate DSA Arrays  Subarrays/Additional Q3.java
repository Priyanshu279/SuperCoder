import java.util.*;

class Main {
    
    public static int subarraySumLessthanB(int A[],int B){
        int N=A.length;
        int count=0;
        
        for(int i=0;i<N;i++){
            int sum=0;
            for(int j=i;j<N;j++){
                sum=sum+A[j];
                if(sum<B){
                    count++;
                }
            }
        }
        return count;
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
        
        int ans=subarraySumLessthanB(A,B);
        System.out.println(ans);
        
	}
}