public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Созонов Денис Сергеевич", 1, 85700);
        employee[1] = new Employee("Иванов Иван Иванович", 2, 72000);
        employee[2] = new Employee("Зарипов Алмаз Артурович", 3, 82000);
        employee[3] = new Employee("Абрамов Тимур Аркадьевич", 4, 69800);
        employee[4] = new Employee("Давлетшин Юрий Семёнович", 5, 70900);
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null)
                System.out.println(employee[i]);
        }

    }
}