package standardEdition;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import callable.LoggingProcessor;

public class LogProcessorClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService service = Executors.newFixedThreadPool(2);
		List<Callable<Boolean>> callables = new ArrayList<>();
		// add 10 tasks to callable list
		for(int i=0;i<10;i++) {
		callables.add(new LoggingProcessor());
		}
		
		try {
			List<Future<Boolean>> futures = service.invokeAll(callables);
			for(Future<Boolean>future:futures)
				System.out.println(future.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
     try {
		System.out.println(service.invokeAny(callables));
	} catch (InterruptedException | ExecutionException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     service.shutdown();
     try {
		System.out.println("Is service get shutdown ?: "+service.awaitTermination(30, TimeUnit.SECONDS));
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		service.shutdownNow();
		e.printStackTrace();
	}
	}

}
