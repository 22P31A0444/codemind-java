import java.util.*;
public class ThreeDivisorsCount {
    
    public static int countNumbersWithThreeDivisors(int n) {
        int count = 0;
        
        for (int i = 1; i <= n; i++) {
            if (hasExactlyThreeDivisors(i)) {
                count++;
            }
        }
        
        return count;
    }
    
    public static boolean hasExactlyThreeDivisors(int num) {
        if (num < 4) {
            return false;
        }
        
        int sqrt = (int) Math.sqrt(num);
        
        return sqrt * sqrt == num && isPrime(sqrt);
    }
    
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Scanner mr=new Scanner(System.in);
        int n;
        n=mr.nextInt();
        int count = countNumbersWithThreeDivisors(n);
        System.out.println(count);
    }
}
