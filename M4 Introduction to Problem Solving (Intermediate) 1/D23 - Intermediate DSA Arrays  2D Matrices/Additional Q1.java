import java.util.*;

class Main {
    
    public static void scalarProduct(int A[][],int B){
        int N=A.length;
        int M=A[0].length;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                A[i][j]=A[i][j]*B;
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
        
        int B=sc.nextInt();
        
        scalarProduct(A,B);
        
        for(int row=0;row<N;row++){
            for(int col=0;col<M;col++){
                System.out.print(A[row][col]+" ");
            }
            System.out.println();
        }
    
	}
}