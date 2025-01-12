import java.util.*;

class Main {
    public static long subsequence(String A){
        int N=A.length();
        long cnt=0l;
        long sfxCnt=0l;
        for(int i=N-1;i>=0;i--){
            if(A.charAt(i)=='G'){
                sfxCnt++;
            }else if(A.charAt(i)=='A'){
                cnt=cnt+sfxCnt;
            }
        }
        return cnt;
    }
    
	public static void main(String args[]) {
		// Your code goes here
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        long ans = subsequence(A);
        System.out.println(ans);
	}
}