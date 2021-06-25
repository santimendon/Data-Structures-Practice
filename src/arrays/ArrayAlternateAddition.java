package arrays;

public class ArrayAlternateAddition {
    public static void main(String[] args) {
        //int number[] = {1, 2, 3, 4, 5, 6, 7, 8}; //sum1 1+3+5+7=16 sum2=2+4+6+8=20
        int number[] = {3, 20, 50, 10, -1, 70};
        int n = number.length;

        if (n > 0) {
            int sum1 = number[0];
            int sum2 = number[1];
            for (int i = 1; i < n; i++) {
                if (i % 2 == 0) {
                    sum1 += number[i];
                    sum2 += number[i + 1];
                }
            }
            System.out.print("Sum 1: " + sum1 + " Sum 2: " + sum2);
        }

    }
}
