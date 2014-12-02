package demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class MethodReference {
	public static void main(String[] args) {
		Team myTeam = Team.create(Team::new); // Mtd reference: constructor
		List<Team> teams = Arrays.asList(myTeam);
		teams.forEach(Team::combine); // Mtd reference: static method
		teams.forEach(Team::meet); // Mth reference: instance method
		
		Team secondTeam = Team.create(Team::new);
		teams.forEach(secondTeam::drink); // Mtd reference: method from particular object
	}
}

class Team {
	public static Team create(final Supplier<Team> supplier) {
		return supplier.get();
	}

	public static void combine(final Team anotherTeam) {
		System.out.println("Combined with " + anotherTeam.toString());
	}

	public void meet() {
		System.out.println("Meet " + this.toString());
	}

	public void drink(final Team another) {
		System.out.println("Drinking with " + another.toString());
	}
}
