package Urisu;

public class hello {
    int a;
    int b;
    int sum = 0;

    public void plus(int a, int b) {
        this.a = a;
        this.b = b;
        sum = this.a + this.b;
    }
}


class hi {
    public static void main(String[] args) {
        hello hello = new hello();
        hello.plus(10, 21);
        int a = hello.sum;
        System.out.println(a);
    }
}


