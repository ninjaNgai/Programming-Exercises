package Chapter5;

public class Singleton {

	// Code is guaranteed to be thread safe
	private static Singleton uniqueInstance = new Singleton();
	
	private Singleton() {}
	
	// OPTION 1 - synchronize
	// synchronized forces every thread to wait its turn before it can enter the method.
	// That is, no two threads may enter the method at the same time.
	// synchronizing a method can decrease performance by a factor of 100
	/**
	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		
		return uniqueInstance;
	}
	*/
	
	// OPTION 2 - move to an eagerly created instance rather than a lazily created on
	// We rely on JVM to create the unique instance when the class is loaded.
	public static Singleton getInstance() {
		return uniqueInstance;
	}
	
	
}
