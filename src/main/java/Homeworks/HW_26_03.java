package Homeworks;
//Задание 1: Поиск элемента в отсортированном массиве

public class HW_26_03 {
    public static int find(int[] arr, int x, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (arr[mid] == x) {
            return mid;
        } else if (arr[mid] < x) {
            return find(arr, x, mid + 1, right);
        } else {
            return find(arr, x, left, mid - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {11, 22, 44, 50, 60, 86, 114, 140, 145, 190};
        int x = 114;
        System.out.println(find(arr, x, 0, arr.length - 1)); // Output: 6
    }
}
