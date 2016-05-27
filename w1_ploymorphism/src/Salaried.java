

public class Salaried extends Employee{

	private int sarary;

	public int getSarary() {
		return sarary;
	}

	public void setSarary(int sarary) {
		this.sarary = sarary;
	}

	@Override
	public double calcGrossPay(int month, int year) {
		// TODO Auto-generated method stub
		return this.sarary;
	}
}
