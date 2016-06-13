package w1_Duck;

public class RedheadDuck extends Duck {

	RedheadDuck() {
		this.flyBehavior = new FlyWithWing();
		this.quackBehavior = new Quack();
	}
	@Override
	public void display(){
		System.out.println("\tdisplaying");
	}
}
