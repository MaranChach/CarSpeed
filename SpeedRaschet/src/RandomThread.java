import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RandomThread implements Callable<Integer> {

    @Override
    public Integer call() throws InterruptedException {
        Thread.sleep(1000);
        return new Random().nextInt(1, 100);
    }
}
