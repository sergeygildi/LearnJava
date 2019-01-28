package com.education.Basic;

/**
 * Created by Serhii Hildi on 23.01.19.
 */
public class Algorithms {


    /**
     * Binary Search (recursive) Example
     */
    static class BinarySearchRecursive {

        public static void main(String[] args) {
            int[] list = {1,2,3,4,5,6,7,8,9,10,11,12};
        }

        private static int rank(int item, int[] list) {
            return binarySearch(item, list, 0, list.length - 1);
        }

        private static int binarySearch(int item, int[] list, int low, int high) {
            if (low > high) return -1;

            int mid = low + (high - low) / 2;

            if (item < list[mid]) {
                return binarySearch(item, list, low, mid -1);
            } else if (item > list[mid]) {
                return binarySearch(item, list, mid + 1, high);
            } else return mid;
        }
    }

    /**
     * Binary Search Example
     */
    static class BinarySearch {
        public static void main(String[] args) {
            int[] list = new int[129];

            for (int i = 1; i <= 128; i++) {
                list[i] = i;
            }

            System.out.println(binarySearch(list, 77));
        }

        private static int binarySearch(int[] list, int item) {
            int first = 0;
            int last = list.length - 1;
            int mid = 0;

            while (first <= last) {

                mid = (last + first) / 2;

                if (list[mid] == item) return mid;

                if (list[mid] > item) {
                    last = mid - 1;
                } else {
                    first = mid + 1;
                }
            }
            return mid;
        }
    }

    /**
     * Selection Sort Example
     */
    static class SelectionSort {
        public static void main(String[] args) {
            int[] list = {123,3,213,55,68,334,2,33};
            for (int i = 0; i < list.length; i++) {
                System.out.print(list[i] + " ");
            }
            System.out.println();
            selectionSort(list);
        }

        private static  void selectionSort(int[] numbers) {

            // Внешним циклом проходим (по всем-1) элементам массива
            for (int i = 0; i < numbers.length - 1; i++) {
                // Вводим 2 переменные, которым при каждом проходе цикла присваивается актуальное значение i.
                int min = numbers[i];
                int minIndex = i;

                /*
                Внутренний циклом ищем наименьший элемент среди всего массива.
                Сохраняем в отдельные переменные значение и индекс переменной.
                **/
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[j] < min) {
                        min = numbers[j];
                        minIndex = j;
                    }
                }

                // Проверяет стоит ли число на своем месте в списке, нужно ли двигать.
                // Если нужно, создаем временную переменную и меняем местами с тукущей положение индекса i.
                if (i != minIndex) {
                    int temp = numbers[i];
                    numbers[i] = numbers[minIndex];
                    numbers[minIndex] = temp;
                }
                System.out.print(numbers[i] + " ");
            }

        }
    }
}
