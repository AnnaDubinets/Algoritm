package Homeworks;
//Задание 2: Поиск максимального элемента в неотсортированном массиве

public class _3 {
    public static int findMax(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.max(arr[n - 1], findMax(arr, n - 1));
    }

    public static void main(String[] args) {
        int[] arr = {4, 7, 9, 2, 15, 14};
        System.out.println(findMax(arr, arr.length)); // Output: 15
    }
}
