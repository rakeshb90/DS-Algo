package standardEdition;

import runnable.UserProcessor;

public class UserClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserProcessor userProcessor = new UserProcessor();
		Thread thread = new Thread(userProcessor);
		
        
	}

}
