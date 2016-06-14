package Q1.soln2;

import Q1.Employee;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by 985219 on 6/13/2016.
 */
public class Solun2Tester {
    @Test
    public void runSalaryGreaterThan100000() {
        Employee employee = new Employee("Joe", "Davis", 120000);
        assertTrue("Expect Result true, test case " + employee.toString(), true && Main.salaryGreaterThan100000(employee));
    }
    @Test
    public void runLastNameAfterMEmployee(){
        Employee employee1 = new Employee("Joe", "Davis", 120000);
        Employee employee2 = new Employee("Joe", "Mavis", 120000);
        Employee employee3 = new Employee("Joe", "zavis", 120000);
        assertFalse("Should return false"+employee1.toString(),Main.lastNameAfterMEmployee(employee1));
        assertFalse("Should return false"+employee2.toString(),Main.lastNameAfterMEmployee(employee2));
        assertTrue("Should return True"+employee3.toString(),Main.lastNameAfterMEmployee(employee3));
    }
    @Test
    public void runFullName(){
        Employee employee1 = new Employee("Joe", "Davis", 120000);
        String fullName=employee1.getFirstName()+" "+employee1.getLastName();
        assertTrue("full name is "+fullName,fullName.equals(Main.fullName(employee1)));
    }
}
