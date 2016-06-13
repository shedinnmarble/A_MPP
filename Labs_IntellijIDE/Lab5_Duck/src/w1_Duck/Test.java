package w1_Duck;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck[] ducks={new MallardDuck(),new DecoyDuck(),new RedheadDuck(),new RubberDuck()};
		for(Duck d:ducks){
			System.out.println(d.getClass().getSimpleName()+":");
			d.display();
			d.fly();
			d.quack();
			d.swim();
		}
	}

}
