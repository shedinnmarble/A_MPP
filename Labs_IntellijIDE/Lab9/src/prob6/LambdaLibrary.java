package prob6;

import prob5.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by 985219 on 6/10/2016.
 */
public class LambdaLibrary {
    public static final TriFunction<List<Employee>, Integer, Character, Integer> EMPLOYEE_COUNT_BY_SALARY_LASTNAME = (employeesList, salary, lastNameChar) ->
            employeesList
                    .stream()
                    .filter(employee -> employee.getSalary() > salary && employee.getLastName().charAt(0) > lastNameChar)
                    .collect(Collectors.toList())
                    .size();
}
