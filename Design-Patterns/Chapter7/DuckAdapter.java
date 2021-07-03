package Chapter7;

public class DuckAdapter implements Turkey {
	Duck duck;
	
	public DuckAdapter(Duck duck) {
		// TODO Auto-generated constructor stub
		this.duck = duck;
	}

	@Override
	public void gobble() {
		// TODO Auto-generated method stub
		duck.quack();

	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 5; i++) {
			duck.fly();
			System.out.println("I've stopped flying");
		}
		
	}

}
