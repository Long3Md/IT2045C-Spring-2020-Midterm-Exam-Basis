/*
 * Mark Long
 * long3md@mail.uc.edu
 * IT2045C
 * Midterm Test Part 2
 * 03/05/2020
 * Have a great day professor!
 */
package spacecraft;

public class IntergalacticCamaro extends Spacecraft {
	// Creating a property called color
	private String color;
	/***
	 * a constructor calling the base class
	 * @param name the name of the camaro
	 * @param color the color of the camaro
	 */
	public IntergalacticCamaro(String name, String color) {
		super(name);
		this.color=color;
	}

	@Override
	public void Launch() {
			
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
		
	}
	// created a toString method
	public String toString() {
		return " Color : " + color;

	}
}
