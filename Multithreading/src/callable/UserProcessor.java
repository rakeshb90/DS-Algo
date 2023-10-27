package callable;

import java.util.StringTokenizer;
import java.util.concurrent.Callable;

import dao.UserDao;
import entity.User;

public class UserProcessor implements Callable<Integer>{
	private String userRecord;
	private UserDao dao;
	public UserProcessor(String userRecord, UserDao dao) {
		super();
		this.userRecord = userRecord;
		this.dao = dao;
	}
	@Override
	public Integer call() throws Exception {
		System.out.println(Thread.currentThread().getName()+": processing user record "+userRecord);
		StringTokenizer tokenizer = new StringTokenizer(userRecord,",");
		int rows=0;
		while(tokenizer.hasMoreTokens()) {
			User user = new User();
			user.setUserEmail(tokenizer.nextToken());
			user.setUserName(tokenizer.nextToken());
			user.setUserId(Integer.valueOf(tokenizer.nextToken()));
			rows = dao.saveUser(user);
		}
		
		return rows;
	}
	

}
