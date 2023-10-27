package runnable;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileReaderRunnableImpl implements Runnable{

	@Override
	public void run() {
		try(BufferedReader reader=new BufferedReader(new FileReader(
				new File("D:\\Coding\\Ex_Files_Java_EE_Concurrency\\Ex_Files_Java_EE_Concurrency\\Exercise Files\\Chapter2\\02_03\\begin\\sample.txt")))){
				String line = null;
				while((line=reader.readLine())!=null)
					System.out.println(Thread.currentThread().getName()+" : "+line);
			}
			catch(Exception e) {
				System.out.println("Error: "+e);
			}
	}

}
