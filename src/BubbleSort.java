import java.util.Arrays;

public class BubbleSort {
    static int[] arr = new int[]{99, 65, 111, 69, 50, 1, 4, 6, 80};

    public int[] Sort() {
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i -1; j++){
                if(arr[j + 1] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        sort.Sort();
        System.out.println(Arrays.toString(arr));
    }
}
