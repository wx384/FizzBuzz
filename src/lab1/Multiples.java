package lab1;

public class Multiples {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i < 1000; i++) {
            ;
            boolean multiplesOf3 = i % 3 == 0;
            boolean multiplesOf5 = i % 5 == 0;

            if (multiplesOf3 || multiplesOf5) {
                total++;
            }
        }
        System.out.println(total);
    }
}
