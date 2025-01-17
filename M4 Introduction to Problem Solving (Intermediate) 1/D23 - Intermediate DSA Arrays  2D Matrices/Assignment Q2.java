import java.util.*;

class Main {
    
    public static int[] rowSum(int A[][]){
        int N=A.length;
        int M=A[0].length;
        
        int rowSum[]=new int[N];
        for(int row=0;row<N;row++){
            int sum=0;
            for(int col=0;col<M;col++){
                sum=sum+A[row][col];
            }
            rowSum[row]=sum;
        }
        return rowSum;
    }
    
	public static void main(String args[]) {
		// Your code goes here
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int A[][]=new int[N][M];
        
        for(int row=0;row<N;row++){
            for(int col=0;col<M;col++){
                A[row][col]=sc.nextInt();
            }
        }
        
        int ans[]=rowSum(A);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
	}
}