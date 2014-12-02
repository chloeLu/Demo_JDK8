package demo;


public class FunctionalInterfaceDemo {
}

@FunctionalInterface
interface DemoInterface {
	public void method();
	default void defaultMethod() {}
	static void staticMethod() {}
}
