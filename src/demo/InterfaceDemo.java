package demo;

public class InterfaceDemo {
	public static void main (String[] args) {
		TradeFI checker = t->t.isSuccessful();
		Trade myTrade = new Trade(true);
		System.out.println(checker.validate(myTrade));
	}
}

@FunctionalInterface
interface TradeFI {
	public boolean validate(Trade t);
	default void place() {}
	public static void compare() {}
}

interface Plant {
	default String name() {
		return "plant";
	}
	public static boolean growing() {
		return true;
	}
}

class Trade{
	public boolean isSuccessful;
	public Trade(boolean isSuccessful) {
		this.isSuccessful = isSuccessful;
	}
	public boolean isSuccessful() {
		return isSuccessful;
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
