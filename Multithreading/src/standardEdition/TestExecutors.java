package standardEdition;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import callable.UserProcessor;
import dao.UserDao;

public class TestExecutors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService service = Executors.newSingleThreadExecutor();
		List<String> users = getUsersFromFile("D:\\Coding\\Ex_Files_Java_EE_Concurrency\\Ex_Files_Java_EE_Concurrency\\Exercise Files\\Chapter3\\03_04\\begin\\new_users.txt");
        UserDao dao = new UserDao();
		for(String user: users) {
        	Future<Integer> future = service.submit(new UserProcessor(user,dao));
        	try {
				System.out.println("Process operation result: "+future.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
        }
		service.shutdown();
		System.out.println("Main operation has done!");
	}
	public static List<String> getUsersFromFile(final String fileName){
		List<String> users = new ArrayList<>();
		try(BufferedReader reader= new BufferedReader(new FileReader(new File(fileName)))){
			String line = null;
			while((line=reader.readLine())!=null) {
				users.add(line);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return users;
	}

}
