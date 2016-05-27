package w1_Duck;

public class RubberDuck extends Duck {

	RubberDuck() {
		this.flyBehavior = new CanotFly();
		this.quackBehavior = new Squeak();
	}

	@Override
	public void display() {
		System.out.println("\tdisplaying");
	}

}
