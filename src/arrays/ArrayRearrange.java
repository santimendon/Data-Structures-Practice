package arrays;

/*
Rearrange an array such that arr[i] = i
https://www.geeksforgeeks.org/rearrange-array-arri/
*/
/*
Time complexity: O(n)
check if greater than 0 and a[i] !=i(means already in right position
move number at index = a[i] to temp ie a[a[i]]
move a[i] to new index ie to a[a[i]]
Finally move temp to a[i]
 */

public class ArrayRearrange {

    public static void main(String[] args) {
        //int number[] = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};

        int number[] = {19, 7, 0, 3, 18, 15, 12, 6, 1, 8, 11, 10, 9, 5, 13, 16, 2, 14, 17, 4};
        int n = number.length;
        for (int i = 0; i < n; i++) {
            if (number[i] >= 0 && number[i] != i) {
                int temp = number[number[i]];
                number[number[i]] = number[i];
                number[i] = temp;
            }
        }

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
    }
}
