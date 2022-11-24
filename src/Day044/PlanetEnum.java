/*Write a java program to create an Enum and take Planets of the solar system as a dataset 
 * and print the weight of a person in all the planets of the solar system.*/

package Day044;

import java.util.Scanner;
enum Planet {
	//Creating planet enums which contains the mass of and radius of that particular planet.
    MERCURY (3.303e+23, 2.4397e6),
    VENUS   (4.869e+24, 6.0518e6),
    EARTH   (5.976e+24, 6.37814e6),
    MARS    (6.421e+23, 3.3972e6),
    JUPITER (1.9e+27,   7.1492e7),
    SATURN  (5.688e+26, 6.0268e7),
    URANUS  (8.686e+25, 2.5559e7),
    NEPTUNE (1.024e+26, 2.4746e7),
    PLUTO   (1.27e+22,  1.137e6);

	//Declaring mass and radius of planets globally.
    private final double mass;   // in kilograms
    private final double radius; // in meters
    
    Planet(double mass, double radius) {
    	//Initializing the mass and radius.
        this.mass = mass;
        this.radius = radius;
    }
    
    public double mass() {
    	//This method returns the mass of the planets.
    	return mass; 
    }
    public double radius() {
    	//This method returns the radius of the planets.
    	return radius;
    }

    // universal gravitational constant  (m3 kg-1 s-2)
    public static final double G = 6.67300E-11;

    public double surfaceGravity() {
    	//Creating a method for calculating the surface gravity of the planets and return it.
        return G * mass / (radius * radius);
    }
    public double surfaceWeight(double otherMass) {
    	//Creating a method for calculating the surface weight of a person on any planets and return it.
        return otherMass * surfaceGravity();
    }
}

public class PlanetEnum {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Taking earth weight of a person as a input.
		System.out.print("Enter your weight: ");
		double earthWeight = sc.nextDouble();
	
		Planet earth = Planet.EARTH;
        double mass = earthWeight / earth.surfaceGravity();
        
        //Printing the weight of that person in all the planets of solar system.
        for (Planet p : Planet.values())
           System.out.printf("Your weight on %s is %f%n",
                             p, p.surfaceWeight(mass));
	}

}



//-------------Test Case-------------

//TestCase1:
//Input: 75
//Output: 
//Your weight on MERCURY is 28.331821
//Your weight on VENUS is 67.874932
//Your weight on EARTH is 75.000000
//Your weight on MARS is 28.405289
//Your weight on JUPITER is 189.791814
//Your weight on SATURN is 79.951165
//Your weight on URANUS is 67.884540
//Your weight on NEPTUNE is 85.374605
//Your weight on PLUTO is 5.015585

//TestCase2:
//Input: 100
//Your weight on MERCURY is 37.775762
//Your weight on VENUS is 90.499910
//Your weight on EARTH is 100.000000
//Your weight on MARS is 37.873718
//Your weight on JUPITER is 253.055753
//Your weight on SATURN is 106.601554
//Your weight on URANUS is 90.512720
//Your weight on NEPTUNE is 113.832807
//Your weight on PLUTO is 6.687446

