package OOPS1;

public class Employee extends Company {
    String empName;
    int age;

    public void print() {
        System.out.println("Working at: " + getCompanyName());
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.empName = "Shradha";
        emp.age = 24;
        // emp.companyName = "Walmart";
        emp.setCompanyName("Walmart");
        emp.companyCity = "Hyderabad";
        System.out.println("Employee: " + emp.empName + " age: " + emp.age);
        System.out.println(" City: " + emp.companyCity);
        emp.print();
    }
}
