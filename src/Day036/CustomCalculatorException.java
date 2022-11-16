//Custom exception as required to solve the problem.

package Day036;

@SuppressWarnings("serial")
public class CustomCalculatorException extends Exception {
	public CustomCalculatorException(String message) {
		super(message);
	}
}
