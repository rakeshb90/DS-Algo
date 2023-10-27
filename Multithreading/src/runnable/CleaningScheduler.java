package runnable;

import java.io.File;

public class CleaningScheduler implements Runnable{
	@Override
	public void run() {
//		Thread.sleep(2000);
		File folder = new File("D:\\Coding\\serverLogs");
		File[] files = folder.listFiles();
		for(File file:files) {
			if(System.currentTimeMillis()-file.lastModified()>1*60*1000) {
				System.out.println("The file will get deleted: "+file.getName());
//				file.delete();
			}
		}
		
	}

}
