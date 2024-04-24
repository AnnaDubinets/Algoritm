package de.teleran.HW_24_04;

public class _1 {

    //Мёржинг двух отсортированных массивов
    def merge(arr1, arr2):
    merged_arr = []
    i, j = 0, 0

            while i < len(arr1) and j < len(arr2):
            if arr1[i] <= arr2[j]:
            merged_arr.append(arr1[i])
    i += 1
            else:
            merged_arr.append(arr2[j])
    j += 1

            while i < len(arr1):
            merged_arr.append(arr1[i])
    i += 1

            while j < len(arr2):
            merged_arr.append(arr2[j])
    j += 1

            return merged_arr

//Примеры
    print(merge([2, 4, 7, 11], [1, 3, 4, 5, 8, 12]))  # [1, 2, 3, 4, 4, 5, 7, 8, 11, 12]
    print(merge([2, 4, 7, 11], [8, 12]))  # [2, 4, 7, 8, 11, 12]

}
