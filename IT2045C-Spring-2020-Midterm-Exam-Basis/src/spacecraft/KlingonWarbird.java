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
 * Model a Klingon Warbird-class spacecraft in the Star Trek canon
 * @author nicomp
 *
 */
public class KlingonWarbird extends Spacecraft {
	
	public KlingonWarbird(String name) {
		super(name);
	}
	
	@Override
	public void Launch() {
		System.out.println("I am a Klingon Warrbird and I am launching.");
	}


}
