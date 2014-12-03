package demo;


public class InterfaceDemo {
	public static void main (String[] args) {
	}
}

@FunctionalInterface
interface DemoInterface {
	public void method();
	default void defaultMethod() {}
	public static void staticMethod() {}
}

interface Plant {
	default String name() {
		return "plant";
	}
	public static boolean growing() {
		return true;
	}
}

interface Fruit {
	default String name() {
		return "fruit";
	}
	public static boolean growing() {
		return false;
	}
}

class Apple implements Plant, Fruit {
	@Override
	public String name() {
		return Fruit.super.name();
	}
}
