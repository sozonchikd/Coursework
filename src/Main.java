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
        for ( int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i]);
            }
        }
    }

    public static double maxSalary() {

        double max = Double.MIN_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees [i] != null && employees[i].getSalary() > max) {
                max = employees[i].getSalary();
            }
        }
        System.out.println("Максимальная зарплата сотрудника " +max);
        return max;
    }

    public static double minSalary() {
        double min = Double.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < min) {
                min = employees[i].getSalary();
            }
        }
        System.out.println("Минимальная зарплата " + min);
return min;
    }



}