import java.util.*;

class Main {
    
    public static int maxSumOfSubarray(int C[],int B){
        int A=C.length;
        int maxSum=Integer.MIN_VALUE;
        
        for(int i=0;i<A;i++){
            int sum=0;
            for(int j=i;j<A;j++){
                sum=sum+C[j];
                if(sum<=B){
                    maxSum=Math.max(maxSum,sum);
                }
            }
        }
        
        if(maxSum != Integer.MIN_VALUE){
            maxSum=maxSum;
        }
        else{
            maxSum=0; 
        }
        return maxSum;
    }
    
	public static void main(String args[]) {
		// Your code goes here
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int C[]=new int[A];
        
        for(int i=0;i<A;i++){
            C[i]=sc.nextInt();
        }
        
        int B=sc.nextInt();
        int ans=maxSumOfSubarray(C,B);
        
        System.out.println(ans);
	}
}