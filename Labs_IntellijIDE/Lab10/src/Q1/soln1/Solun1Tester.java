package Q1.soln1;

import Q1.Employee;

import Q1.Main;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertTrue;

/**
 * Created by 985219 on 6/13/2016.
 */
public class Solun1Tester {
    @Test
    public void runAsString() {
        List<Employee> emps = Arrays.asList(
                new Employee("Joe", "Davis", 120000),
                // new Employee("John", "Sims", 110000),
                new Employee("Joe", "Stevens", 200000),
                new Employee("Andrew", "Reardon", 80000),
                new Employee("Joe", "Cummings", 760000),
                // new Employee("Steven", "Walters", 135000),
                new Employee("Thomas", "Blake", 111000),
                new Employee("Alice", "Richards", 101000),
                new Employee("Donald", "Trump", 100000));

        List<Employee> expectList = Arrays.asList(
                new Employee("Alice", "Richards", 101000),
                new Employee("Joe", "Stevens", 200000)
        );
        assertTrue("Expect Result[Alice Richards, Joe Stevens]", sameList(expectList, Main.asString(emps)));

    }

    @Test
    public  void test2() {
    }

    private boolean sameList(List<Employee> l1, String output) {
        return l1.stream()
                .map(employee -> employee.getFirstName() + " " + employee.getLastName())
                .collect(Collectors.joining(", ")).equals(output);
    }
}
