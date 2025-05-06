package ThreadsandConcurrency;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableSample implements Callable<String> {

	private String name;

	public CallableSample(String name) {
		this.name = name;
	}
	@Override
	public String call() throws Exception {

		return "Hello " + name;
	}

}
public class CallableAndFuture {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CallableSample cs = new CallableSample("Single Callable");
		ExecutorService es = Executors.newSingleThreadExecutor();
		System.out.println(es.submit(cs).get());
		es.shutdown();
		// System.out.println(es.submit(cs));Exception
		//Executing multiple callable objects
		List<CallableSample> lst = List.of(new CallableSample("Akash"), new CallableSample("Rahul"),
				new CallableSample("Rohit"));
		es = Executors.newFixedThreadPool(2);
		List<Future<String>> results = es.invokeAll(lst);
		for (Future<String> result : results) {
			System.out.println(result.get());
		}
		System.out.println(es.invokeAny(lst));
	}
}
