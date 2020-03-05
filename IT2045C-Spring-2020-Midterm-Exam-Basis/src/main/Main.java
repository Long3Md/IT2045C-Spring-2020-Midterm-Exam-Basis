/*
 * Mark Long
 * long3md@mail.uc.edu
 * IT2045C
 * Midterm Test Part 2
 * 03/05/2020
 * Have a great day professor!
 */
package main;

import spacecraft.BorgCube;
import spacecraft.IntergalacticCamaro;
import spacecraft.KlingonWarbird;
import spacecraft.StarshipEnterprise;

public class Main {

	public static void main(String[] args) {
		StarshipEnterprise NCC1701 = new StarshipEnterprise("NCC 1701");
		KlingonWarbird destroyer = new KlingonWarbird("porgh");
		BorgCube borgCube = new BorgCube("101100100111000111100011");
		// created a new object called camaro
		IntergalacticCamaro Camaro = new IntergalacticCamaro("Camaro","Red");
		
		System.out.println(NCC1701.toString());
		System.out.println(destroyer.toString());
		System.out.println(borgCube.toString());
		// print out the toString testing the method
		System.out.println(Camaro.toString());

		
		
	}

}
