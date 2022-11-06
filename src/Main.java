public class Main {
    private static Employee[] employees;

    public static void main(String[] args) {
        employees = new Employee[10];
        employees[0] = new Employee("Созонов Денис Сергеевич", 1, 85850);
        employees[1] = new Employee("Иванов Иван Иванович", 2, 72000);
        employees[2] = new Employee("Зарипов Алмаз Артурович", 3, 82000);
        employees[3] = new Employee("Абрамов Тимур Аркадьевич", 4, 69800);
        employees[4] = new Employee("Давлетшин Юрий Семёнович", 3, 70900);
        employees[5] = new Employee("Минилбаева Алина Алексеевна", 1, 84700);
        System.out.println(calculateSalarySum());
        fullInformation();
        maxSalary();
        minSalary();
        System.out.println(averageSalarySum());
        fullNameInformation();   // Ф.И.О
        //indexationSalary(5);   // Индексация в %
        //fullInformation();
        minSalaryDepartmen(3);
        maxSalaryDepartmen(3);
        calculateSalarySumDepartment(3);
        averageSalarySumDepartment(3);
        //indexationSalaryDepartment(5,3); // Индексация отдела в %
        //fullInformation();
        searchMin(80000);  // поиск зарплаты меньше вводного значения
        fullInformationDepartment(1); // Информация по конкретному отделу
        searchMax(80000);  // поиск зарплаты больше вводного значения

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

        double id = 0;               //Максимальная зарплата
        double max = Double.MIN_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                id = employees[i].getId();
            }
        }
        System.out.println("Максимальная зарплата сотрудника " + max + " id №" + (int) id);
        return max;
    }

    public static double minSalary() {
        int id = 0;             //Минимальная зарплата
        double min = Double.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                id = employees[i].getId();
            }
        }
        System.out.println("Минимальная зарплата сотрудника " + min + " id №" + (int) id);
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

    public static void indexationSalary(int percent) {     //Индексация зарплаты
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                double currentSalary = employees[i].getSalary();
                employees[i].setSalary(currentSalary * (percent / 100d + 1));
            }
        }
    }

    public static double minSalaryDepartmen(int departmen) {  // Минимальная зарплата в отделе
        int id = 0;
        double minDepartmen = Double.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() != departmen) {
                continue;
            }
            if (employees[i] != null && employees[i].getSalary() < minDepartmen) {
                minDepartmen = employees[i].getSalary();
                id = employees[i].getId();
            }
        }
        System.out.println("Минимальная зарплата в отделе №" + departmen + " " + minDepartmen + " id сотрудника №" + id);
        return minDepartmen;
    }

    public static double maxSalaryDepartmen(int departmen) {        // Максимальная зарплата в отделе
        int id = 0;
        double maxDepartmen = Double.MIN_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() != departmen) {
                continue;
            }
            if (employees[i] != null && employees[i].getSalary() > maxDepartmen) {
                maxDepartmen = employees[i].getSalary();
                id = employees[i].getId();
            }
        }
        System.out.println("Максимальная зарплата в отделе №" + departmen + " " + maxDepartmen + " id сотрудника №" + id);
        return maxDepartmen;
    }

    public static double calculateSalarySumDepartment(int department) {  // Сумма затрат по отделу
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                sum = sum + employees[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплату по отделу №" + department + " " + sum);
        return sum;
    }

    public static double averageSalarySumDepartment(int department) { //Средняя зарплата по отделу
        double average = 0;
        int amount = 0;
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                amount++;
                sum = sum + employees[i].getSalary();
            }
        }
        average = sum / amount;
        System.out.println("Средняя зарплата по отделу №" + department + " " + average);
        return average;
    }

    public static void indexationSalaryDepartment(int percent, int department) { //  Индексаци зарплаты по отделу
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                double currentSalary = employees[i].getSalary();
                employees[i].setSalary(currentSalary * (percent / 100d + 1));
            }
        }
    }

    public static void fullInformationDepartment(int department) {  //список всех сотрудников отдела со всеми имеющимися по ним данным
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                System.out.println(employees[i].getFullName() + "  зарплата " + employees[i].getSalary() + " id " + employees[i].getId());
            }
        }
    }

    public static void searchMin(double numberSalary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < numberSalary) {
                System.out.println(employees[i]);
            }
        }
    }

    public static void searchMax(double numberSalary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() >= numberSalary) {
                System.out.println(employees[i]);
            }
        }
    }

}