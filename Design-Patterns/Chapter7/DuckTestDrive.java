package Chapter7;

// Bonus class - How would we create a Duck to Turkey Adapter?
public class DuckTestDrive {

	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		Turkey duckAdapter = new DuckAdapter(duck);
		
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		System.out.println("The turkey says...");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nThe Duck says...");
		testDuck(duck);
	
		// Try to pass the turkey off as a duck
		System.out.println("\nThe TurkeyAdapter says...");
		testDuck(turkeyAdapter);
		
		// Try to pass the duck off as a turkey
		System.out.println("\nThe DuckAdapter says...");
		testTurkey(duckAdapter);
		

	}
	
	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
	
	static void testTurkey(Turkey turkey) {
		turkey.gobble();
		turkey.fly();
	}

}
