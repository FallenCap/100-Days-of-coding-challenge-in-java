package Day057;

import java.util.HashMap;

public class IDPassword {

	HashMap<String, String>loginInfo = new HashMap<String, String>();
	
	IDPassword() {
		loginInfo.put("Subham", "1234");
		loginInfo.put("Rupam", "5678");
		loginInfo.put("Atin", "9876");
	}
	
	@SuppressWarnings("rawtypes")
	protected HashMap getLoginInfo() {
		return loginInfo;
	}
}
