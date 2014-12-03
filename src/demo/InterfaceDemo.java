package demo;


public class InterfaceDemo {
}

@FunctionalInterface
interface DemoInterface {
	public void method();
	default void defaultMethod() {}
	static void staticMethod() {}
}

interface Plant {
	default boolean isGrowing() {
		return true;
	}
}
