public class Practice {
    public static void main(String[] args) {
        // int x = 3;
        // int y = x++;
        // System.out.println(++x * 8);

        // int a = 42, b = ~a;
        // System.out.println(a + "" + b); 42 -43
        // int c = a & b;
        // System.out.println(a ^ b);
        // int d = a | b;
        // System.out.println(d);
        // int e = a ^ b;
        // System.out.println(e);
        // int f = c + d + e;
        // System.out.println(~f);
        // a++;
        // --b;
        // int c = a-- + b--;
        // System.out.println(++c + "a " + a + "b " + b);
        // Using logical && or || if 1st statement is false while comparing then it will
        // won't check the 2nd statement(b++)
        // int a = 10, b = 20;
        // if (a++ > 10 || ++b > 20) {
        // System.out.println("Inside if");
        // } else {
        // System.out.println("Inside else");
        // }
        // System.out.println("a " + a + " b" + b); // a = 61, b = 80
        // int a = 10;
        // a += ++a - 5 / 3 + 6 * a;
        // System.out.println(a++ + --b);
        // System.out.println(a-- + ++b);
        // System.out.println(a++ - ++b);
        // System.out.println(a);
        for (int i = 1; i < 5; i = i + 1) {
            System.out.println(i + " ");
            i = i + 1;
        }

    }
}
