
import java.util.Calendar;
import java.util.List;

public class Commissioned extends Employee {
	private int commission;
	private int baseSalary;
	private List<Order> orderList;

	Commissioned(int commission, int baseSalary) {
		this.commission=commission;
		this.baseSalary=baseSalary;
	}

	public int getCommission() {
		return commission;
	}

	public void setCommission(int commission) {
		this.commission = commission;
	}

	public int getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public double calcGrossPay(int month, int year) {
		// TODO Auto-generated method stub
		double sum=0;
		for(Order order:orderList){
			 Calendar cal = Calendar.getInstance();
			    cal.setTime(order.getOrderDate());
			if(cal.get(Calendar.MONTH)==month&&cal.get(Calendar.YEAR)==year){
				sum+=order.getOrderAmount();
			}
		}
		double grossMoney=sum*this.commission+this.baseSalary;
		
		return grossMoney;
	}

	public List<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}

}
