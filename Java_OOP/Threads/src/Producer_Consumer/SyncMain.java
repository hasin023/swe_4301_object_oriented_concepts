package Producer_Consumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SyncMain {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Buffer sharedLocation = new SynchronizedBuffer();

        Producer producer = new Producer(sharedLocation);
        Consumer consumer = new Consumer(sharedLocation);

        executorService.execute(producer);
        executorService.execute(consumer);

        executorService.shutdown();
    }
}
