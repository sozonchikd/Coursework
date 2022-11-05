public class Main {
    private static Employee[] employees;

    public static void main(String[] args) {
        employees = new Employee[10];
        employees[0] = new Employee("Созонов Денис Сергеевич", 1, 85700);
        employees[1] = new Employee("Иванов Иван Иванович", 2, 72000);
        employees[2] = new Employee("Зарипов Алмаз Артурович", 3, 82000);
        employees[3] = new Employee("Абрамов Тимур Аркадьевич", 4, 69800);
        employees[4] = new Employee("Давлетшин Юрий Семёнович", 5, 70900);
        System.out.println(calculateSalarySum());
        fullInformation();
        maxSalary();
        minSalary();
        System.out.println(averageSalarySum());
        fullNameInformation();
        indexationSalary(5);
        fullInformation();
    }

    public static double calculateSalarySum() {     //сумма затрат на зарплаты в месяц
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum = sum + employees[i].getSalary();
            }
        }
        return sum;
    }

    public static void fullInformation() {     //список всех сотрудников со всеми имеющимися по ним данными
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i]);
            }
        }
    }

    public static double maxSalary() {

        double department = 0;               //Максимальная зарплата
        double max = Double.MIN_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                department = employees[i].getDepartment();
            }
        }
        System.out.println("Максимальная зарплата сотрудника " + max + " отдел № " + (int) department);
        return max;
    }

    public static double minSalary() {
        double department = 0;             //Минимальная зарплата
        double min = Double.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                department = employees[i].getDepartment();
            }
        }
        System.out.println("Минимальная зарплата " + min + " отдел № " + (int) department);
        return min;
    }

    public static double averageSalarySum() {     //Средняя зарплата в месяц
        double sum = 0;
        double amount = 0;
        double average = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                amount++;
                sum = sum + employees[i].getSalary();
            }
        }
        average = sum / amount;
        return average;
    }

    public static void fullNameInformation() {        //Ф.И.О сотрудников
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.print(employees[i].getFullName() + ", ");
            }
        }
        System.out.println();
    }

    public static void indexationSalary(int percent) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                double currentSalary = employees[i].getSalary();
                employees[i].setSalary(currentSalary * (percent / 100d + 1));
            }
        }

    }

}