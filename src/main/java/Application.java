import java.sql.*;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args)  {

 //       EmployeeDAO employeeDAO = new EmployeeDAOImpl();
 //       Employee kristina = new Employee("Kristina", "Korstin", "female", 36, 2);
 //       employeeDAO.add(kristina);

 //       System.out.println(employeeDAO.getById(1));

 //       Employee vio = new Employee(9, "Vio", "Letta", "female", 20, 4);
 //       employeeDAO.updateEmployee(vio);

 //       List<Employee> list = employeeDAO.readAll();

 //       for (Employee employee : list) {
  //          System.out.println(employee);
  //      }
  //      employeeDAO.deleteEmployee(vio);
  //      employeeDAO.deleteEmployee(kristina);

  //      for (Employee employee : list) {
  //          System.out.println(employee);
 //       }


  //      CityDAO cityDAO = new CityDAOImpl();

  //      City vladivostok = new City("Vladivostok");
  //      cityDAO.add(vladivostok);

  //      List<City> cityList = cityDAO.readAll();
  //      for (City city: cityList) {
  //          System.out.println(city);
  //      }
   //     cityDAO.getById(1);
  //      City habarovsk = new City(vladivostok.getCity_id(), "Habarovsk");
  //      cityDAO.updateCity(habarovsk);

        // Напишите код, с помощью которого можно разделить строку на части.
        String s = "I love sunday";
        String [] words = s.split (" ");
        for (String word : words){
            System.out.println(word);
        }

































    }
}