import java.util.*;

public class Main {
    public static int countMinimalCoprimeSegments(int l, int r) {
        int count = 0;
        for (int i = l; i <= r; i++) {
            count++;
            for (int j = i + 1; j <= r; j++) {
                if (gcd(i, j) == 1) break;
                count++;
            }
        }
        return count;
    }
    
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            System.out.println(countMinimalCoprimeSegments(l, r));
        }
        scanner.close();
    }
}
