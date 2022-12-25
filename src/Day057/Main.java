package Day057;

public class Main {

	public static void main(String[] args) {
		IDPassword idandPasswords = new IDPassword();
		
		
		@SuppressWarnings({ "unused", "unchecked" })
		LoginSystem login = new LoginSystem(idandPasswords.getLoginInfo());
	}

}
