package w1_Duck;

public class RedheadDuck extends Duck {

	RedheadDuck() {
		this.flyBehavior = new FlyWithWing();
		this.quackBehavior = new Quack();
	}
}
