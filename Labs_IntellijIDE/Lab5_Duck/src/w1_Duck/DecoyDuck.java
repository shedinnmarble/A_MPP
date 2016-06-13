package w1_Duck;

public class DecoyDuck extends Duck{
	DecoyDuck(){
		this.flyBehavior=new CanotFly();
		this.quackBehavior=new MuteQuack();
	}
	@Override
	public void display(){
		System.out.println("\tdisplaying");
	}
}
