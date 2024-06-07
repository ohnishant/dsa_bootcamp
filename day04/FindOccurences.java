import java.util.HashMap;

class FindOccurences {
    void findOccurences(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                int count = map.get(ch);
                map.put(ch, count + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (char ch : map.keySet()) {
            System.out.println(ch + " : " + map.get(ch));
        }

    }

    public static void main(String[] args) {
        FindOccurences obj = new FindOccurences();
        obj.findOccurences("Hello World");
    }

}
