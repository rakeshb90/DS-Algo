package standardEdition;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import callable.LoggingProcessor;
import custom.CustomThreadFactory;

public class TestCustomThreadFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService service = Executors.newFixedThreadPool(3,new CustomThreadFactory());
		for(int i=0;i<10;i++)
		service.submit(new LoggingProcessor());
	}

}
