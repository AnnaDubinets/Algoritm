package de.teleran.HW_24_04;

public class _2 {

    //Мёржинг трёх отсортированных массивов
    def merge(arr1, arr2, arr3):
            return merge(merge(arr1, arr2), arr3)

            # Пример использования:
    print(merge([2, 4, 7, 11], [8, 12], [4, 9, 11]))  # [2, 4, 4, 7, 8, 9, 11, 11, 12]

}
