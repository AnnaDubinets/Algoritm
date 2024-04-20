package Homeworks;
//Хвостовая рекурсия для поиска максимального элемента:

public class _4 {
    public static int findMaxTailRecursive(int[] arr, int n, int maxSoFar) {
        if (n == 0) {
            return maxSoFar;
        }
        return findMaxTailRecursive(arr, n - 1, Math.max(arr[n - 1], maxSoFar));
    }

    public static void main(String[] args) {
        int[] arr = {4, 7, 9, 2, 15, 14};
        System.out.println(findMaxTailRecursive(arr, arr.length, Integer.MIN_VALUE)); // Output: 15
    }
}
