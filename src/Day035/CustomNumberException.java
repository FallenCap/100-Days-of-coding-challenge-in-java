//Creating the custom exception for the main class.

package Day035;

@SuppressWarnings("serial")
public class CustomNumberException extends Exception{
	public CustomNumberException(String message) {
		super(message);
	}
}
