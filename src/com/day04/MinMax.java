package day04;

class MinMax {
    void minMax(int[] arr) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Min: " + min + "\tMax: " + max);
    }

    public static void main(String[] args) {
        int[] arr = { 12, 3, 4, 5, 6 };
        MinMax obj = new MinMax();
        obj.minMax(arr);
    }

}
