import java.util.*;

public class Main{
    public static int findMinimumXORSum(int A, int B){
        int minSum=Integer.MAX_VALUE;
        
        int X=A&B;
        int sum=(A^X)+(B^X);
        minSum=Math.min(minSum, sum);
        return minSum;
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        
        System.out.println(findMinimumXORSum(A,B));
    }
}