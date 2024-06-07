import java.util.HashMap;

class TwoSum {
    int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;
        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            if (map.containsKey(diff)) {
                res[0] = (int) map.get(diff);
                res[1] = i;
                return res;
            }
            map.put(arr[i], i);

        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 3, 4, 5, 6 };
        int target = 16;
        TwoSum obj = new TwoSum();
        int[] result = obj.twoSum(arr, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

}
