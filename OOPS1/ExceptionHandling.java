package OOPS1;

public class ExceptionHandling {

    // Here, it is not handling the exception throwing it calling function
    public static int factNegativeNumber(int num) throws FactorialNegativeException {
        if (num <= 0) {
            throw new FactorialNegativeException();
        }
        int ans = 1;
        for (int i = 1; i <= num; i++) {
            ans *= i;
        }
        return ans;
    }

    public static int divideByZero(int a, int b) throws DivideByZeroException {
        if (b == 0) {
            throw new DivideByZeroException();
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            factNegativeNumber(-9);
            divideByZero(10, 5);
            System.out.println("Try Block Executed");
        } catch (FactorialNegativeException e) {
            System.out.println("Factorial Exception. Look into that");
        } catch (DivideByZeroException e) {
            System.out.println("We have got an Divide by zero Exception. Try to solve it");
        }
        System.out.println("Program Executed Successfully");
    }
}

/**
 * 1. If we want to handle any Exception, we need to create a class and extends
 * it with "Exception".
 * 2. Wherever you get an exception, throw that Exception from that exception
 * from that method, it will handle in the catch block from where it called.
 * 3. It will handle only one Exception at a time & after solving that, we will
 * move into the next Exception
 */