package introdate;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee employee = new Employee(2020, 12, 22, "Mézga Géza");
        System.out.println(employee.getName());
        System.out.println(employee.getBeginEmployment());
        System.out.println(employee.getDateOfBirth());
    }
}
