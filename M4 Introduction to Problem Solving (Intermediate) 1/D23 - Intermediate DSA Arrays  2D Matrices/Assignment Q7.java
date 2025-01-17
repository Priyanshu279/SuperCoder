import java.util.*;

class Main {
    
    public static void reverseRows(int A[][]){
        int N=A.length;
        int M=A[0].length;

        for(int i=0;i<N;i++){
            int left=0; 
            int right=M-1;

            while(left<right){
                int temp=A[i][left];
                A[i][left]=A[i][right];
                A[i][right]=temp;
                left++;
                right--;
            }
        }
    }
    
    public static void transpose(int A[][]){
        int N=A.length;
        
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
        
        int A[][]=new int[N][N];
        
        for(int row=0;row<N;row++){
            for(int col=0;col<N;col++){
                A[row][col]=sc.nextInt();
            }
        }
        
        // Rotate 90 degree
        transpose(A);
        reverseRows(A);
        
        for(int row=0;row<N;row++){
            for(int col=0;col<N;col++){
                System.out.print(A[row][col]+" ");
            }
            System.out.println();
        }
    
	}
}