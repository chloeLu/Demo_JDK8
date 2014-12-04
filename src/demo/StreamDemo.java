package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		StreamDemo demo = new StreamDemo();
		List<Person> personList = demo.createPersonList();
		// demo here
		demo.demoSimple(personList);
	}

	public List<Person> createPersonList() {
		return Arrays.asList(
				new Person("Alice", 31), 
				new Person("Bill", 39),
				new Person("Tom", 10), 
				new Person(null, 40),
				new Person("George", 70),
				new Person("Sark", 20));
	}
	
	/**
	 * Goal: collects all names from pList
	 */
	public void demoSimple(List<Person> pList) {
		List<String> names = pList.stream().map(p->p.getName()).collect(Collectors.toList());
		printList(names);
	}
	
	/**
	 * Goal: collects all names from pList
	 */
	public void demoSimple_jdk6(List<Person> pList) {
		List<String> names = new ArrayList<String>();
		for (Person p: pList) {
			names.add(p.getName());
		}
		printList(names);
	}
	
	/**
	 * Goal: return a list of names:
	 * 1. whose age is greater than 20, and
	 * 2. sort in ascending order of age, and
	 */
	public void demoWithMoreOperations (List<Person> pList) {
		List<String> names =pList.parallelStream().filter(p -> p.getAge() > 20)
									  .sorted(new Comparator<Person>() {
										  public int compare(Person o1, Person o2) {
											  return o1.getAge()-o2.getAge();
										  }})
									  .map(p->p.getName())
									  .collect(Collectors.toList());
		printList(names);
	}
	
	// Helper
	public void printList(List<String> list){
		for (String s: list) {
			System.out.println(s);
		}
	}
}
