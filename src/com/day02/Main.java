package day02;

public class Main {
    public static void count(int num) {
        System.out.println(num);
        if (num < 0) {
            return;
        }
        count(num - 1);
    }

    public static void main(String[] args) {
        count(10);
    }
}
