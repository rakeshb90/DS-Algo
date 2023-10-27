package runnable;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import entity.User;

public class UserProcessor implements Runnable {
	dao.UserDao userDao = new dao.UserDao();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try(BufferedReader reader=new BufferedReader(new FileReader(
				new File("D:\\Coding\\Ex_Files_Java_EE_Concurrency\\Ex_Files_Java_EE_Concurrency\\Exercise Files\\Chapter2\\03_04\\begin\\new_users.txt")))){
				String line = null;
				while((line=reader.readLine())!=null) {
					String[] info = line.split(",");
					User user = new User();//(info[0],info[1],info[2]);
					user.setUserId(Integer.parseInt(info[0]));
					user.setUserName(info[1]);
					user.setUserEmail(info[2]);
					int row = userDao.saveUser(user);
					System.out.println("Row: "+row);
				}
					
			}
			catch(Exception e) {
				System.out.println("Error: "+e);
			}

		
	}
	

}
