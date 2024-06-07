/**
 * ReverseArray
 */
public class ReverseArray {

    int[] reverseArr(int[] arr) {
        int n = arr.length;
        int temp;
        for (int i = 0; i < n / 2; i++) {
            temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - i - 1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6 };
        ReverseArray obj = new ReverseArray();
        arr = obj.reverseArr(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
