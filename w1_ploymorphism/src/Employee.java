


public abstract class Employee {
	private int empId;

	public void print() {
	};

	public Paycheck calcCompensation;

	public abstract double calcGrossPay(int month, int year);

	public Paycheck calcCompensation(int month, int year) {
		double grossPay = calcGrossPay( month,  year);
		double fica = grossPay * 0.23;
		double state = grossPay * 0.05;
		double local = grossPay * 0.01;
		double medicare = grossPay * 0.03;
		double ssn = grossPay * 0.075;
		Paycheck payCheck = new Paycheck(grossPay, fica, state, local, medicare, ssn);
		return payCheck;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
}
