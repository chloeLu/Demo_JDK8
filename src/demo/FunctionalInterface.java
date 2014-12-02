package demo;


public class FunctionalInterface {
}

@java.lang.FunctionalInterface
interface DemoInterface {
	public void method();
	default void defaultMethod() {}
	static void staticMethod() {}
}
