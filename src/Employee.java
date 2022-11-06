public class Employee {
    private String fullName;
    private int department;
    private double salary;
    public static int count = 1;
    public int id;

    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id = count;
        count++;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудник " +
                "Ф.И.О='" + fullName + '\'' +
                ", отдел=" + department +
                ", зарплата=" + salary +
                ", id=" + id;
    }
}
