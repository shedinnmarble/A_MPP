package prob5;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * Created by yafen on 2016/6/9.
 */
public class LambdaLibrary {
    public static final TriFunction<List<Employee>, Integer, String, String>  NAMES_IN_EMPLOYEE=(list,salary,character)->list
            .stream()
            .filter(employee -> employee.getSalary()>salary&&employee.getLastName().charAt(0)>character.charAt(0))
            .map(employee -> employee.getFirstName()+" "+employee.getLastName())
            .sorted()
            .collect(Collectors.joining(","));
}
