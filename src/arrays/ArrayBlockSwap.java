package arrays;/*
Block swap algorithm for array rotation
https://www.geeksforgeeks.org/block-swap-algorithm-for-array-rotation/
https://www.codespeedy.com/block-swap-algorithm-for-array-rotation-in-java/
*/

/*
Initialize A = arr[0..d-1] and B = arr[d..n-1]
1) Do following until size of A is equal to size of B

a)  If A is shorter, divide B into Bl and Br such that Br is of same
length as A. Swap A and Br to change ABlBr into BrBlA. Now A
is at its final place, so recur on pieces of B.

b)  If A is longer, divide A into Al and Ar such that Al is of same
length as B Swap Al and B to change AlArB into BArAl. Now B
is at its final place, so recur on pieces of A.

2)  Finally when A and B are of equal size, block swap them.
*/

public class ArrayBlockSwap {
    public static void main(String[] args) {
        ArrayBlockSwap instance = new ArrayBlockSwap();
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7};
        //int size = numbers.length;
        int d = 4;

        int[] swappedArr = instance.swap(numbers, 1, 3, d);
        for (int i = 0; i < swappedArr.length; i++) {
            System.out.print(swappedArr[i] + " ");
        }
    }

    private void rotate(int[] arr, int i, int d, int size) {
        if (d == 0 || d == size)
            return;

        /*
         * Half of array size
         */
        if (size - d == d) {
            swap(arr, i, size - d + i, d);
            return;
        }

        /*
         * Size of A is smaller
         */
        if (d < size - d) {
            swap(arr, i, size - d + i, d);
        }
        /*
         * Size of B is smaller
         */
        else {

        }

    }

    /*
    arr: org array
    x: starting index of block
    y: ending index of block
    d: number of places to move
     */
    private int[] swap(int arr[], int x, int y, int d) {
        for (int i = 0; i < d; i++) {
            int temp = arr[x + i];
            arr[x + i] = arr[y + i];
            arr[y + i] = temp;
        }

        return arr;
    }

}
