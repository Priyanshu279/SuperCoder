import java.util.*;

class Main {
    public static int[][] makeSpiralMatrix(int A){
        int[][] mat=new int[A][A];
        int N=A;
        int i=0;
        int j=0;
        int steps=N-1;
        int counter=0;
        while(steps>=1){

            // from top-left to top-right --->
            for(int k=0;k<steps;k++){
                counter++;
                mat[i][j]=counter;
                j++;
            }

            // from top-right to bottom-right v
            for(int k=0;k<steps;k++){
                counter++;
                mat[i][j]=counter;
                i++;
            }

            // from botton-right to bottom-left <----
            for(int k=0;k<steps;k++){
                counter++;
                mat[i][j]=counter;
                j--;
            }

            // from bottom-left to top-left ^
            for(int k=0;k<steps;k++){
                counter++;
                mat[i][j]=counter;
                i--;
            }
            i++;
            j++;
            steps=steps-2;
        }
        if(steps==0){
            counter++;
            mat[i][j]=counter;
        }
        return mat;
    }
    
    public static void printspiralMatrix(int mat[][]){
        int N=mat.length;
        for(int rows=0;rows<N;rows++){
            for(int cols=0;cols<N;cols++){
                System.out.print(mat[rows][cols]+" ");
            }
            System.out.println();
        }
    }
    
	public static void main(String args[]) {
		// Your code goes here
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        
        int Spiral[][]=makeSpiralMatrix(A);
        printspiralMatrix(Spiral);
	}
}