import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// new employee, commision $10, baseSalary $1000
		Commissioned commissionedEmployee = new Commissioned(10, 1000);
		System.out.println(new Date());
		Order order1 = new Order(commissionedEmployee, 1, new Date(), 10);
		Order order2 = new Order(commissionedEmployee, 1, new Date(), 10);
		Order order3 = new Order(commissionedEmployee, 1, new Date(), 10);
		Order order4 = new Order(commissionedEmployee, 1, new Date(), 10);
		Order order5 = new Order(commissionedEmployee, 1, new Date(), 10);
		List<Order> orderList = new ArrayList<Order>();
		orderList.add(order1);
		orderList.add(order2);
		orderList.add(order3);
		orderList.add(order4);
		orderList.add(order5);
		commissionedEmployee.setOrderList(orderList);
		// Period period = new Period()

		double grossMoney = commissionedEmployee.calcGrossPay(4, 2016);
		Employee employee = commissionedEmployee;
		Paycheck paycheck = employee.calcCompensation(4, 2016);
		double netPay = paycheck.getNetPay();
		System.out.println(grossMoney);
		System.out.println("netPay" + netPay);
		
		//--------------Hourly Employee
		Employee hourly=new Hourly(100,1000);
		Paycheck paycheckHourly=hourly.calcCompensation(5,2016);
		double netPayHourly=paycheckHourly.getNetPay();
		System.out.println("netPay Hourly" + netPayHourly);

	}

}
