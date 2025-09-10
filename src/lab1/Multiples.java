package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples(1000, 5, 3));
    }

    public static int multiples(int n, int a, int b) {
//        int count = 0;
//        for (int i = 1; i < n; i++) {
//            ;
//            boolean multiplesOfA = i % a == 0;
//            boolean multiplesOfB = i % b == 0;
//
//            if (multiplesOfA || multiplesOfB) {
//                count++;
//            }
//        }
//        return count;
        int count = 0;
        if (a == b){
            count = (n - 1) / a;
        } else {
            count = (n - 1) / a + (n - 1) / b - (n - 1) / ((a * b) / gcd(a, b));
        }
        return count;
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static int multiples() {
        return multiples(1000, 3, 5);
    }
}
