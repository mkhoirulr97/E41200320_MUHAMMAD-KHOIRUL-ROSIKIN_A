package Sorting;

/**
 *
 * @author khoirul
 */
public class SelectionSort {

    public static void main(String a[]) {
        int[] arr1 = {3, 6, 8, 1, 5};
        System.out.println("Nilai Sebelum diurutkan");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        //mengurutkan array menggunakan Selestion Sort
        selectionSort(arr1);

        System.out.println("Nilai Setelah diurutkan Selection Sort");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                //mencari nilai index terkecil
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }
}
