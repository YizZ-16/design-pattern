package strategy;

public abstract class Duck {
	
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	protected  void swim(){
		System.out.println("i can swim");
	}
	
	protected  void display(){
		System.out.println("i am a Duck");
	}
	
	protected void performQuack(){
		quackBehavior.quack();
	}
	
	protected void performFly() {
		flyBehavior.fly();
	}
	
	protected void setFlyBehavior(FlyBehavior f) {
		this.flyBehavior = f;
	}
	
	protected void setQuackBehavior(QuackBehavior q) {
		this.quackBehavior = q;
	}

}
