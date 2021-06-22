package arrays;/*
Program for array reversal
Write a function rotate(ar[], n) that reverses arr[] of size n.
https://www.geeksforgeeks.org/reverse-an-array-in-java/
20-06-2021
*/

public class ArrayReversal {
    public static void main(String[] args) {
        ArrayReversal instance = new ArrayReversal();
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] reversedArr = instance.reverse(numbers, numbers.length);
        for (int i = 0; i < reversedArr.length; i++) {
            System.out.print(reversedArr[i] + " ");
        }
    }

    private int[] reverse(int originalArray[], int n) {
        int[] reversedArray = new int[n];
        for (int i = 0; i < n; i++) {
            reversedArray[n - 1 - i] = originalArray[i];
        }
        return reversedArray;
    }
}