import java.util.*;

class Main {
    public static int countPairs(String A) {
		long sfxCount = 0l;
        long count = 0l;
        for (int i = A.length() - 1; i >= 0; i--) {
            if (A.charAt(i) == 'A') {
                count = count + sfxCount;
            } else if (A.charAt(i) == 'G') {
                sfxCount++;
            }
        }
        return (int)(count%1000000007);
    }

	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int ans=countPairs(s);
		System.out.println(ans);
	}
}