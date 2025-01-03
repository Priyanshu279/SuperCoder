public class Solution {
    public int solve(int[] A) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            if(min>A[i]){
                min=A[i];
            }
            if(max<A[i]){
                max = A[i];
            }
        }
        if(max == min)
        {
            return 1;
        }
        int mini = -1;
        int maxi = -1;
        int anslen = A.length;
        for(int i = A.length -1; i>0;i--)
        {
            if(A[i] == min)
            {
                mini = i;
                if(maxi!= -1)
                {
                    anslen = Math.min(anslen,maxi-mini+1);
                }
            }
            else if(A[i] == max)
            {
                maxi = i;
                if(mini != -1)
                {
                    anslen = Math.min(anslen, mini-maxi+1);
                }
            }
        }
        return anslen;
    }
    
}
