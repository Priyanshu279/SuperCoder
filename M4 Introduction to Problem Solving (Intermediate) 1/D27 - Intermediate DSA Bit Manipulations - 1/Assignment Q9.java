import java.util.*;

public class Main{
    public static int findSingleNumber(int[] A) {
        int result = 0;
        for (int num : A) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] A1 = {1, 2, 2, 3, 1};
        int[] A2 = {1, 2, 2};

        System.out.println("Output 1: " + findSingleNumber(A1)); 
        System.out.println("Output 2: " + findSingleNumber(A2)); 
        }
}
