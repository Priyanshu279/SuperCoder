import java.util.*;

class Main{
    public static int BestTimetoBuyandSellStocks(int A[]){
        int N=A.length;
        if(N==0 || N==1){
            return 0;
        }
        
        int max=A[N-1];
        int profit=0;

        for(int i=N-2;i>=0;i--){
            max=Math.max(A[i],max);
            profit=Math.max(max-A[i],profit);
        }
        return profit;
    }
    
	public static void main(String args[]) {
		// Your code goes here
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int A[]=new int[N];
        
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        
        int ans=BestTimetoBuyandSellStocks(A);
        System.out.println("max profit: "+ans);
        
	}
}