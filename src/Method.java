public class Method {
    public static  Employee[] employees = new Employee[10];
    public static String calculateSalary;
    public static String findMaxSalary;
    public static String averageSalary;
    private static double sum;

    public static void
    printArray(){
        for (Employee employee : employees)
            System.out.println(employee);
    }
    public static double calculateSalary(Employee[] employees) {
        double sum = 0;
        for ( Employee employee : Method.employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }
    public static Employee findMaxSalary(Employee[]employees) {
        Employee search = Method.employees[0];
        double maxSalary = Method.employees[0].getSalary();
        for (Employee employee : Method.employees) {
            if (employee !=null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                search = employee;
            }
        }
        return search;
    }
    public static Employee findMinSalary(Employee[]employees) {
        Employee search = Method.employees[0];
        double minSalary = Method.employees[0].getSalary();
        for (Employee employee : Method.employees) {
            if (employee !=null && employee.getSalary() > minSalary) {
                minSalary = employee.getSalary();
                search = employee;
            }}
        return search;
    }

    public static  Employee averageSalary (Employee[] employees) {

        double averageSalary = sum / employees.length;
        return null;
    }


}