public class SumDigit {
    public static int sumDigit(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
    public static int recursiveSumDigit(int number) {
        if (number == 0) {
            return 0;
        }
        return number % 10 + recursiveSumDigit(number/10);
    }

    public static void main(String args[]) {
        int number = 12330;
        int iterativeResult = sumDigit(number);
        int recursiveResult = recursiveSumDigit(number);

        System.out.println("[Iterative]\tNumber: " + number + " has "+iterativeResult + " sum");
        System.out.println("[Recursive]\tNumber: " + number+ " has " + recursiveResult + " sum");
    }
}
