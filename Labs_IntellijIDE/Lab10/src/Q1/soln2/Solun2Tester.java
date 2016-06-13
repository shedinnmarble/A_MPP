package Q1.soln2;

import Q1.Employee;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by 985219 on 6/13/2016.
 */
public class Solun2Tester {
    @Test
    public void runsalaryGreaterThan100000(){
        Employee employee= new Employee("Joe", "Davis", 120000);
        assertTrue("Expect Result true, test case "+employee.toString(),true&&Main.salaryGreaterThan100000(employee));
    }
}
