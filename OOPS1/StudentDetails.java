package OOPS1;

public class StudentDetails {
    String name;
    private int accountNumber;

    public int getAccountNumber() {
        return this.accountNumber;
    }

    // 1. set method won't return anything, it will set the value
    // 2. By using, "this" keyword, it will reference to the current object property
    // 3. If we use the same variable name, reference the global variable with this
    // keyword

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
        System.out.println("this: " + this);
    }
}
