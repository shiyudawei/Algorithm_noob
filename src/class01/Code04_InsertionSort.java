package class01;

public class Code04_InsertionSort {

    public static void insertionSort(int [] arr){
        if (arr == null || arr.length < 2) return;
        // 0~1 / 0~2 / 0~3 / ... / 0~arr.length
        for (int i = 1; i < arr.length; i++){
            int index = i;
            for (int j = i; j > 0; j--){
                // i-1~index / i-2~index / ... / 0~index
                if(greater(arr, j-1, index)){
                    exch(arr, j-1, index);
                    //Index随时改变
                    index = j-1;
                }

            }
        }
    }

    public static void insertionSort2(int [] arr){
        if (arr == null || arr.length < 2) return;

        for (int end = 1; end < arr.length; end++){
            for (int j = end; j > 0 && arr[j-1] > arr[j]; j--){
                exch(arr, j-1, j);
            }
        }
    }

    public static void exch(int [] arr, int i, int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static boolean greater(int [] arr, int i, int j){
        if (arr[i] > arr[j]){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args){
        int [] arr = {9, 8, 7, 6, 8, 1, 2, 7, 1};
        insertionSort2(arr);
        printArray(arr);

    }

    public static void printArray(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
