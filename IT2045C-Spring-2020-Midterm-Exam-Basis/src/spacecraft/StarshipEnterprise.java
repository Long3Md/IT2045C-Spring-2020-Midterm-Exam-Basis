/*
 * Mark Long
 * long3md@mail.uc.edu
 * IT2045C
 * Midterm Test Part 2
 * 03/05/2020
 * Have a great day professor!
 */
package spacecraft;

/**
 * Model the Starship Enterprise in the Star Trek canon
 * @author nicomp
 *
 */
public class StarshipEnterprise extends Spacecraft {
	public StarshipEnterprise(String name) {
		super(name);
	}
	
	@Override
	public void Launch() {
		System.out.println("I am the Starship Enterprise and I am launching.");
	}

}
