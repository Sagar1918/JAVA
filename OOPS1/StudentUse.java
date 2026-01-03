package OOPS1;

public class StudentUse {
    public static void main(String[] args) {
        StudentDetails s1 = new StudentDetails();

        s1.name = "Radhika";
        s1.setAccountNumber(9967543);
        System.out.println("s1: " + s1);
        System.out.println(s1.name + " " + s1.getAccountNumber());
    }
}
