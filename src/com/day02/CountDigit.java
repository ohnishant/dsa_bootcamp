package day02;

public class CountDigit {
    public static int countDigit(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number = number / 10;
        }
        return count;
    }

    public static int recursiveCountDigit(int number) {
        if (number == 0) {
            return 0;
        }
        return 1 + recursiveCountDigit(number / 10);
    }

    public static void main(String args[]) {
        int number = 12330;
        int iterativeResult = countDigit(number);
        int recursiveResult = recursiveCountDigit(number);

        System.out.println("[Iterative]\tNumber: " + number + " has " + iterativeResult + " digits");
        System.out.println("[Recursive]\tNumber: " + number + " has " + recursiveResult + " digits");
    }
}
