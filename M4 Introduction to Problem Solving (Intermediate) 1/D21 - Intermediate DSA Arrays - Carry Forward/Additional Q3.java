import java.util.*;

class Main {
    public static int amazingSubarrays(String S){
        int cnt=0;
        int n=S.length();
        for(int i=0;i<n;i++){
            char c=S.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                cnt=cnt+(n-i);
            }
        } 
        return cnt;
    }
    
	public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        int ans=amazingSubarrays(S);
        System.out.println(ans);    
	}
}