package arrays;

/*
Leaders in an array
https://www.geeksforgeeks.org/leaders-in-an-array/
An element is leader if it is greater than all the elements to its right side.
And the rightmost element is always a leader.
*/

public class ArrayLeader {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 18, 5, 6, 14, 13, 10, 11, 4};

        int n = numbers.length;
        int leader = numbers[n - 1];
        for (int i = 0; i < n; i++) {
            if (numbers[n - 1 - i] > leader) {
                leader = numbers[n - 1 - i];
            }
        }
        System.out.print(leader);
    }
}
