import java.util.*;

class Main {
    // applicable for all size of 2d arrays N*M and N*N
    public static int[][] transpose2(int A[][]){
        int N=A.length;
        int M=A[0].length;
        int trans[][]=new int[M][N];
        
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                trans[j][i]=A[i][j];
            }
        }
        return trans;
    }
    
    // without using extra space, applicable only for square matrix N*N
    public static void transpose1(int A[][]){
        int N=A.length;
        int M=A[0].length;
        
        for(int i=1;i<N;i++){
            for(int j=0;j<i;j++){
                int temp=A[i][j];
                A[i][j]=A[j][i];
                A[j][i]=temp;
            }
        }
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
        
        int ans[][]=transpose2(A);
        int n=ans.length;
        int m=ans[0].length;
        
        for(int row=0;row<n;row++){
            for(int col=0;col<m;col++){
                System.out.print(ans[row][col]+" ");
            }
            System.out.println();
        }
    
	}
}