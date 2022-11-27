/*Create an anonymous class in Java program to compute the result from the innermost brackets.
 * eqn: ((((0)x+6)x+(-4))x+7)x+(-19)*/

package Day047;

import java.util.ArrayList;
import java.util.Collections;

interface Equation {
	//crating inteface equation.
	
	double getSolution(ArrayList<Double> coefficients, double x); //method to find solution of the given equation.
}
public class EquationAno {

	public static void main(String[] args) {
		
		//Crating a ArrayList.
		ArrayList<Double> coeffs = new ArrayList<Double>();
	       coeffs.add(-19.0);
	       coeffs.add(7.0);
	       coeffs.add(-4.0);
	       coeffs.add(6.0);
	       
		Equation solution = new Equation() {
			//Crating the anonymous class.
			
			@Override
			public double getSolution(ArrayList<Double> coefficients, double x) {
				//Overridding the getSolution method
				
				Collections.reverse(coefficients); //reversing the arraylist.
			       Double accumulator = coefficients.get(0);
			       for (int i = 1; i < coefficients.size(); i++) {
			           accumulator = (accumulator * x) + (Double) coefficients.get(i);
			       }
			       return accumulator;
			}
		};
		System.out.println(solution.getSolution(coeffs, 4));
	}

}



//-------------Test Case-------------

//TestCase1:
//Input: 3[argument]
//Output: 128.0

//TestCase2:
//Input: 4[argument]
//Output: 329.0