

public class Hourly extends Employee {
	private int hourlyWage;
	private int hoursPerWeek;

	Hourly( int hourlyWage,int hoursPerWeek){
		this.hourlyWage=hourlyWage;
		this.hoursPerWeek=hoursPerWeek;
	}
	public int getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(int hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public int getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

	@Override
	public double calcGrossPay(int month, int year) {
		// TODO Auto-generated method stub		
		return this.hourlyWage*this.hoursPerWeek*4;
	}
}
