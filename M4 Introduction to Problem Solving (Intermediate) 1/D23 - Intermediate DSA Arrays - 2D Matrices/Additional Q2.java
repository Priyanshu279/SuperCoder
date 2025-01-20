import java.util.*;

class Main {
    
    public static int isAequalB(int A[][],int B[][]){
        int N=A.length;
        int M=A[0].length;
        
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(A[i][j]!=B[i][j]){
                    return 0;
                }
            }
        }
        
        return 1;
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
        
        int B[][]=new int[N][M];
        
        for(int row=0;row<N;row++){
            for(int col=0;col<M;col++){
                B[row][col]=sc.nextInt();
            }
        }
        
        int ans=isAequalB(A,B);
        System.out.println(ans);
	}
}