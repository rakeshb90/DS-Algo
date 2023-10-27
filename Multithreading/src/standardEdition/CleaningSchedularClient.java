package standardEdition;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import runnable.CleaningScheduler;

public class CleaningSchedularClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
//		service.schedule(new CleaningScheduler(), 5, TimeUnit.SECONDS);
//		service.scheduleAtFixedRate(new CleaningScheduler(), 5, 3, TimeUnit.SECONDS);
		service.scheduleWithFixedDelay(new CleaningScheduler(), 5, 3, TimeUnit.SECONDS);
		// first task after delay of 5 sec
		// 2 sec time to execute the task
		// waiting time 3 sec
	}

}
