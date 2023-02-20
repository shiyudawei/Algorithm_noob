package class01;

import java.util.Arrays;

public class Code02_SelectionSort {
    public static void selectSort(int [] arr){
        if (arr == null || arr.length < 2){
            return;
        }
        // 0 - n-1   1 - n-1   2 - n-1
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            // i - n-1
            int minValueIndex = i;
            for (int j = i+1; j < N; j++) {
                minValueIndex = arr[j] < arr[minValueIndex] ? j : minValueIndex;
            }
            exch(arr, i, minValueIndex);


        }

    }

    /*
    交换一个数组中不同下标的数
     */
    public static void exch(int [] arr, int i, int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static void main(String[] args) {
        int [] arr = {2,4,3,8,6,5,1,7,9};
        selectSort(arr);
        printArray(arr);

    }

    public static void printArray(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
