public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees = new Employee[]{
                new Employee("Васечкин Пётр Сергеевич", 89473, 3),
                new Employee("Клод Жан Вандамович", 111384, 1),
                new Employee("Шварцнегер Арнольд Терминаторович", 38912, 4),
                new Employee("Стёпа Дядя Великанович", 69832, 4),
                new Employee("Фон Ай Эпплович", 137584, 2),
                new Employee("Хонор Хаувэй Китаевич", 456352, 3),
                new Employee("Андерсон Ганс Кристиан", 45673, 2),
                new Employee("Смит Иии Вессон", 99374, 1),
                new Employee("Пистолет Пулемёт Шпагина", 70437, 5),
                new Employee("Grand Theft Auto", 59673, 5)
        };
        employees[0] = new Employee("Васечкин Пётр Сергеевич", 89473, 3);
        printFullNames();
        printEmployees();
        System.out.println("Общие затраты на сотрудников в месяц: " + calculateTotalSalary() + " рублей");
        System.out.println("Средняя зарплата сотрудников: " + calculateAverageSalary() + " рублей");
        System.out.println("Сотрудник с минимальной зарплатой: " + calculateMinSalaryEmployee());
        System.out.println("Сотрудник с максимальной зарплатой" + calculateMaxSalaryEmployee());
    }

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int calculateTotalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee calculateMinSalaryEmployee() {
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee calculateMaxSalaryEmployee() {
        Employee result = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static float calculateAverageSalary() {
        return calculateTotalSalary() / (float) employees.length;
    }

    public static void printFullNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }
}