package w1_Duck;

public class MallardDuck extends Duck {
	public MallardDuck() {
		// setFlyBehavior(new FlyWithWing());
		super.flyBehavior = new FlyWithWing();
		super.quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("\tdisplay");
	}
}
