public class Employee {
    String name;
    int  hiringYear;
    int  salary;

    public Employee(String name, int hiringYear, int salary)
    {
        this.name = name;
        this.hiringYear = hiringYear;
        this.salary = salary;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getHiringYear()
    {
        return hiringYear;
    }

    public int getSalary()
    {
        return salary;
    }

    public void raiseSalary(int emeles)
    {
        salary = salary+emeles;
    }

    public String toString() {
        return "Ez a  munkavállaló neve:  " + name  +
                ", belépési éve:  " + hiringYear +
                ", fizetése: " + salary;
    }
}


class EmployeeMain{
    public static void main(String[] args) {
        Employee emplo = new Employee("Kovács Kázmér", 1956,  200000);
        emplo.raiseSalary(500);
        System.out.println(emplo);
    }
}
