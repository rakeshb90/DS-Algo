package standardEdition;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import runnable.FileReaderRunnableImpl;
import runnable.FileReaderThread;

public class TestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Extending Thread class
		FileReaderThread thread1 = new FileReaderThread();
		FileReaderThread thread2 = new FileReaderThread();
		FileReaderThread thread3 = new FileReaderThread();
//		thread1.start();
//		thread2.start();
//		thread3.start();
		
		// Implementing Runnable interface
		FileReaderRunnableImpl fileReaderRunnableImpl = new FileReaderRunnableImpl();
		Thread thread = new Thread(fileReaderRunnableImpl);
//		thread.start();
		
		// Using java8 lambda feature
		Thread lambdaThread = new Thread(()->{
			try(BufferedReader reader=new BufferedReader(new FileReader(
					new File("D:\\Coding\\Ex_Files_Java_EE_Concurrency\\Ex_Files_Java_EE_Concurrency\\Exercise Files\\Chapter2\\02_03\\begin\\sample.txt")))){
					String line = null;
					while((line=reader.readLine())!=null)
						System.out.println(Thread.currentThread().getName()+" : "+line);
				}
				catch(Exception e) {
					System.out.println("Error: "+e);
				}
		});
		lambdaThread.setName("lambdaThread");
		lambdaThread.start();
	}

}
