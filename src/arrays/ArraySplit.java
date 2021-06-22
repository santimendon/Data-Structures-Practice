package arrays;/*
Split the array and add the first part to the end | Set 2
https://www.geeksforgeeks.org/split-the-array-and-add-the-first-part-to-the-end-set-2/
*
*/

public class ArraySplit {
    public static void main(String[] args) {
        ArraySplit instance = new ArraySplit();
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        /*
         * First reverse the entire array (0 to n-1): 8--7--6--5--4--3--2--1
         * Second reverse (0 to n-1-k): 3--4--5--6--7--8--2--1
         * Third: reverse the last k part (n-k to n-1): 3--4--5--6--7--8--1--2
         */
        int n = numbers.length;
        int k = 3;
        instance.operate(numbers, k, n);

        System.out.print("\nFinal: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    private void operate(int arr[], int k, int n) {
        reverse(arr, 0, n - 1);
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
    }

    /*Reverse from startIndex to endIndex*/
    private void reverse(int arr[], int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
        System.out.print("\nIn reverse");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("--" + arr[i]);
        }
    }
}
