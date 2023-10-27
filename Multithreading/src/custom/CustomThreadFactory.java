package custom;

import java.util.concurrent.ThreadFactory;

public class CustomThreadFactory implements ThreadFactory {
  private static int COUNT = 0;
	@Override
	public Thread newThread(Runnable r) {
		Thread thread =new Thread();
		thread.setName("Custom Thread - "+(++COUNT));
		return thread;
	}

}
