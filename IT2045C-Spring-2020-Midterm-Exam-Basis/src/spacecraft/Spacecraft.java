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
 * Model a spacecraft in the Star Trek canon
 * @author nicomp
 *
 */
public abstract class Spacecraft implements Launch {
	private String name;

	public Spacecraft(String name) {
		setName(name);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString() {return name;}
}
