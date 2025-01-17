import java.util.*;

class Main {
    
    public static void makeZeros(int A[][]){
        int N=A.length;
        int M=A[0].length;
        
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(A[i][j]==0){
                    for(int k=0;k<M;k++){
                        A[i][k]=0;
                    }
                    for(int l=0;l<N;l++){
                        A[l][j]=0;
                    }
                }
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
        
        makeZeros(A);
        
        for(int row=0;row<N;row++){
            for(int col=0;col<M;col++){
                System.out.print(A[row][col]+" ");
            }
            System.out.println();
        }
        
	}
}