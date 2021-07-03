package Chapter7;

public class TurkeyAdapter implements Duck {
	Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		// Get a reference to the object that we are adapting
		this.turkey = turkey;
		
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		turkey.gobble();

	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		// To map between a Duck's fly() and a Turkey's, we need to call the Turkey's fly() method five times to equate a duck's long-distance flying
		for(int i = 0; i < 5; i++) {
			turkey.fly();
		}

	}

}
