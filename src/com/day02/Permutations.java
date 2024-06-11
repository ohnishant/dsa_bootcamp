package day02;

public class Permutations {
    int count = 0;

    public static void main(String args[]) {
        String str = "ABC";
        Permutations obj = new Permutations();
        obj.permutations(str, str.length(), "");
    }

    void permutations(String s, int maxLength, String str) {
        if (str.length() == maxLength) {
            System.out.println(str);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            permutations(s, maxLength, str + s.charAt(i));
        }
    }
}
