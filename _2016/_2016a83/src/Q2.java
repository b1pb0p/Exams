/**
 * Written by Koren Ben Ezra
 * In 2022b
 */
public class Q2 {

    // The question is recycled from 2015a 89

    // Time complexity: O(log n)
    // Space complexity: O(1)
    public static boolean findX(int[] arr, int x) {
        int low = 0, high = arr.length - 1;

        while (low < high) {

            int mid = (low + high) / 2;
            int sumWithLeft = arr[mid - 1] + arr[mid];
            int sumWithRight = arr[mid] + arr[mid + 1];

            if (sumWithLeft == x || sumWithRight == x)
                return true;

            if (sumWithLeft < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {

        int[] a = {1, 2, 5, 3, 6, 10, 9};

        System.out.println("expected true: " + findX(a, 9));
        System.out.println("expected false: " + findX(a, 5));

    }
}
