package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples(1000, 5, 5));
    }

    public static int multiples(int n, int a, int b) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            ;
            boolean multiplesOfA = i % a == 0;
            boolean multiplesOfB = i % b == 0;

            if (multiplesOfA || multiplesOfB) {
                count++;
            }
        }
        return count;
    }
}
