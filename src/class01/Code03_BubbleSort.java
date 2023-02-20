package class01;

public class Code03_BubbleSort {

    public static void bubbleSort(int[] arr){
        if (arr == null || arr.length < 2){
            return;
        }
        // 0 ~ n-1 / 0 ~ n-2 / 0 ~ n-3/......
        int N = arr.length;
        for (int end = N-1; end > 0; end--){
            // 0 ~ end
            for (int i = 0; i < end; i++){
                //0-1 / 1-2 / 2-3 / ... / end-1 - end
                if(arr[i] > arr[i+1]){
                    exch(arr, i, i+1);
                }
            }
        }
    }

    public static void exch(int [] arr, int i, int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static void main(String[] args) {
        int [] arr = {9,8,7,6,4,5,3,1,2};
        bubbleSort(arr);
        printArray(arr);
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
