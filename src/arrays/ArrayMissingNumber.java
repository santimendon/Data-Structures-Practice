package arrays;

/*
Find the Missing Number in array with 0 to n
https://www.geeksforgeeks.org/find-the-missing-number/
*/

/*
sum of n numbers = n*(n+1)/2
Time complexity O(n)
*/
public class ArrayMissingNumber {
    public static void main(String[] args) {
        ArrayMissingNumber instance = new ArrayMissingNumber();
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12};

        int n = numbers.length;
        /*instance.operate(numbers, n);*/
        instance.xorApproach(numbers, n);
        //System.out.println(getMissingNo(numbers, n));
    }

    private void operate(int arr[], int n) {
        /*Current array size without the missing number is n
         * If we add missing number then it becomes n+1. So n is actually n+1
         * To get sum of all numbers from 0-n : (n+1)(n+1+1)/2 = (n+1)(n+2)/2
         * */

        int totalOfN = (n + 1) * (n + 2) / 2;
        for (int i = 0; i < n; i++) {
            totalOfN -= arr[i];
        }
        System.out.print(totalOfN);
    }

    private void xorApproach(int arr[], int n) {
        int x1 = arr[0];
        int x2 = 1;

        /*
        XOR all elements in array
         */
        for (int i = 1; i < n; i++)
            x1 = x1 ^ arr[i];

        /*
        XOR all numbers from 1 to n
        If we init with 1 then start XOR'ing from 2 till n+1
        n+1 means all numbers including missing number
         */
        for (int i = 2; i <= n + 1; i++)
            x2 = x2 ^ i;

        int missingNumber = (x1 ^ x2);
        System.out.print(missingNumber);
    }
}
