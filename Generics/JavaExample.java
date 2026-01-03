package Generics;

class JavaExample {
    public static void main(String[] args) {
        // instance of Integer type
        Demo<Integer> obj1 = new Demo<Integer>(101);
        System.out.println(obj1.getObject());

        // instance of Float type
        Demo<Float> obj2 = new Demo<Float>(15.55f);
        System.out.println(obj2.getObject());

        // instance of String type
        Demo<String> obj3 = new Demo<String>("BeginnersBook");
        System.out.println(obj3.getObject());

        // instance of Character type
        Demo<Character> obj4 = new Demo<Character>('A');
        System.out.println(obj4.getObject());
    }
}

/**
 * 1. In java Every class is a sub class of an Object. Means Object is a Super
 * class in java.
 */