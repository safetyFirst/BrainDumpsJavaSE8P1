package bd25;

public class Employee {

    String name;
    boolean contract;
    double salary;

    Employee() {
        // line n1
        this.name = new String("Joe");
        this.contract = new Boolean(true);
        this.salary = new Double(100);
    }

    public String toString() {
        return name + ":" + contract + ":" + salary;
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        // line n2
        System.out.print(e);
    }
}
