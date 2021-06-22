package arrays;/*
Program for array rotation
Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
https://www.geeksforgeeks.org/array-rotation/
20-06-2021
*/

/*
 Using temp and shifting the array
 */

/*Time complexity of the above solution is O(nk).*/
public class ArrayRotation {
    public static void main(String[] args) {
        ArrayRotation instance = new ArrayRotation();
        int d = 2;
        int[] numbers = new int[]{10, 4, 16, 8, 10, 14, 16};
        instance.leftRotate(numbers, d, numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    private void leftRotate(int array[], int d, int n) {
        for (int i = 0; i < d; i++) {
            leftRotateByOne(array, n);
        }
    }

    private void leftRotateByOne(int array[], int n) {
        int temp;
        temp = array[0];
        for (int i = 0; i < array.length-1; i++) {
            array[i] = array[i + 1];
        }
        array[n - 1] = temp;
    }
}
