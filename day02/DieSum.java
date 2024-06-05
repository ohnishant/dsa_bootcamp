public class DieSum {
    static String results = "";
    static int count = 0;
    public static void dieSum(int curSum, int targetSum, String currentCombination) {
        // System.out.println(curSum);
        if (curSum > targetSum) {
            return;
        }
        if (curSum == targetSum) {
            count++;
            results += "\n" + currentCombination;
            return;
        }
        for (int i = 1; i <= 6; i++) {
            dieSum(curSum+i, targetSum, currentCombination+i);
        }
    }

    public static void main(String[] args) {
        dieSum(0, 10, "");
        System.out.println(count);
        System.out.println(results);
        
    }
}
