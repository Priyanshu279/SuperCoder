import java.util.*;

class Main {
    
    public static int mainDiagonalSum(int A[][]){
        int N=A.length;
        int sum=0;
        int i=0;
        int j=0;
        
        while(j<N){
            sum=sum+A[i][j];
            i++;
            j++;
        }
        return sum;
    }
    
	public static void main(String args[]) {
		// Your code goes here
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int A[][]=new int[N][N];
        
        for(int row=0;row<N;row++){
            for(int col=0;col<N;col++){
                A[row][col]=sc.nextInt();
            }
        }
        
        int ans=mainDiagonalSum(A);
        System.out.println(ans);
	}
}