package demo;

import java.util.Optional;

public class OptionalDemo {
	public static void main(String[] args) {
		Person p1 = new Person("Tom");
		Person p2 = new Person(null);
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
	Optional<String> name;
	public Person(String name) {
		this.name = Optional.ofNullable(name);
	}
	public boolean identified() {
		return name.isPresent();
	}
	public String getName() {
		return name.orElse("John Doe");
	}
	public String register() {
		return name.map(str -> "Registered " + str).orElseGet(() -> "Cannot register without name");
	}
}