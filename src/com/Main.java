class Main extends A {
    public static void main(String[] args) {

        A obj = new A();
        int x = A.sub(5, 3);
        System.out.println(x);
    }
}

interface Sum {
    int add(int a, int b);

}

class A implements Sum {
    public int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }
}
