import java.sql.*;
import java.util.List;

public class Application {
    public static void main(String[] args) throws SQLException {

        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        Employee kristina = new Employee("Kristina", "Korstin", "female", 36, 2);
        employeeDAO.add(kristina);

        System.out.println(employeeDAO.getById(1));

        Employee vio = new Employee(9, "Vio", "Letta", "female", 20, 4);
        employeeDAO.updateEmployee(vio);

        List<Employee> list = employeeDAO.readAll();

        for (Employee employee : list) {
            System.out.println(employee);
        }
        employeeDAO.deleteEmployee(vio);
        employeeDAO.deleteEmployee(kristina);

        for (Employee employee : list) {
            System.out.println(employee);
        }

    }
}