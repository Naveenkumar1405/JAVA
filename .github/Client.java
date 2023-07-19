import java.util.concurrent.*;

public class Client {

	public static void main(String[] args) throws ExecutionException, InterruptedException 
	{
			List<Integer> arrayToSort = List.of(10,6,4,2,1,3,5,7,9,8);
			
			ExecutorService es= Executors.newCachedThreadPool();
			
			Sorter sorter =new Sorter(arrayToSort, es);
			
			Future<List<Integer>>sortedListFuture = es.submit(sorter);
			
			List<Integer> sortedList = sortedListFuture.get();
			for(Integer in : sortedList) {
				System.out.println(in);
			}
	}

}
