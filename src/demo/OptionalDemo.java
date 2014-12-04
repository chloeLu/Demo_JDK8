package demo;

import java.util.Optional;

public class OptionalDemo {
	public static void main(String[] args) {
		Person p1 = new Person("Tom", 25);
		Person p2 = new Person(null, 20);
		demo(p1);
		demo(p2);
	}

	public static void demo(Person p) {
		System.out.println("Identified? " + p.identified());
		System.out.println("Name: " + p.getName());
		System.out.println(p.register());
	}
}

class Person {
	private Optional<String> name;
	private int age;
	public Person(String name, int age) {
		this.name = Optional.ofNullable(name);
		this.age = age;
	}
	public boolean identified() {
		return name.isPresent();
	}
	public String getName() {
		return name.orElse("John Doe");
	}
	public int getAge() {
		return age;
	}
	public String register() {
		return name.map(str -> "Registered " + str).orElseGet(() -> "Cannot register without name");
	}
	public String selfIntroduction() {
		return "I'm " + getName() + " and I'm " + age;
	}
}
