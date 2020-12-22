package homework_4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Иванов Иван Иванович", "Инженер", "+79513456789", 100000, 35);
        // ---------------------------------------------------
        System.out.println(employee1.getName() + "-" + employee1.getPosition());
        System.out.println( "ID сотрудника "+employee1.getId());
        System.out.println();
        //---------------------------------------------------
        Employee[] employees = new Employee[5];
        employees[0] = employee1;
        employees[1] = new Employee("Романов Сергей Петрович", "Учитель", "+79545671243", 50000, 57);
        employees[2] = new Employee("Смирнов Юрий Васильевич", "Экономист", "+79553456534", 145555, 44);
        employees[3] = new Employee("Шубин Александр Михайлович", "Менеджер", "+79518675437", 120000, 25);
        employees[4] = new Employee("Николаенко Александр Александрович", "Программист", "+79504569009", 130000, 46);

        for (Employee employee : employees) {
            if (employee.getAge() > 40)
                employee.printInfo();
        }
        System.out.println();

        for (Employee employee : employees) {
            employee.raiseSalary();
            employee.printInfo();

        }

    }
}

