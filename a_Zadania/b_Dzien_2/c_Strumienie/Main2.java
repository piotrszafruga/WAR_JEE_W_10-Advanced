package a_Zadania.b_Dzien_2.c_Strumienie;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Main2 {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        List<Employee> listOfEmployees = Arrays.asList(
                new Employee("Jan", "Kowalski", "M",
                        formatter.parse("1980-05-10"), 12000d),
                new Employee("Adam", "Nowak", "M",
                        formatter.parse("199-07-20"), 2000d),
                new Employee("Janina", "Kowalska", "F",
                        formatter.parse("1995-01-05"), 2500d),
                new Employee("Alicja", "Nowak", "F",
                        formatter.parse("1975-07-20"), 4000d),
                new Employee("Alicja", "Nowakowska", "F",
                        formatter.parse("1975-07-20"), 14000d)
        );

        listOfEmployees
                .stream()
                .filter(e -> e.getSurname().startsWith("N"))
                .map(Main2::getEmployeeDescription)
                .forEach(System.out::println);

        listOfEmployees
                .stream()
                .filter(employee -> {
                    Calendar c1 = Calendar.getInstance();
                    c1.setTime(employee.getDateOfBirth());
                    Calendar c2 = Calendar.getInstance();
                    c2.setTime(new Date());
                    int yearDiff = c2.get(Calendar.YEAR) - c1.get(Calendar.YEAR);
                    return yearDiff >= 30 && yearDiff <= 45;
                })
                .map(Main2::getEmployeeDescription)
                .forEach(System.out::println);

        listOfEmployees
                .stream()
                .filter(employee -> employee.getSex() == "F")
                .filter(employee -> {
                    Calendar c1 = Calendar.getInstance();
                    c1.setTime(employee.getDateOfBirth());
                    Calendar c2 = Calendar.getInstance();
                    c2.setTime(new Date());
                    int yearDiff = c2.get(Calendar.YEAR) - c1.get(Calendar.YEAR);
                    return yearDiff >= 20 && yearDiff <= 30;
                })
                .filter(employee -> employee.getSalary() < 3500d)
                .map(employee -> {
                    employee.setSalary(employee.getSalary()*1.05);
                    return employee;
                })
                .map(Main2::getEmployeeDescription)
                .forEach(System.out::println);
    }

    private static String getEmployeeDescription(Employee employee) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        return employee.getName()
                + " "
                + employee.getSurname()
                + " ("
                + formatter.format(employee.getDateOfBirth())
                + "): "
                + employee.getSalary();
    }

}
