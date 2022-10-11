import java.util.Random;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        RandomThread thread = new RandomThread();
        ExecutorService exec = Executors.newCachedThreadPool();
        int segments = 0;
        Integer speedSum = 0;
        float wayLength = 1000;
        float timePassed = 1;
        Car car = new Car();

        while(wayLength > 0){
            segments++;
            Future<Integer> task = exec.submit(new RandomThread());
            Integer speed = task.get();

            car.setSpeed(speed);
            speedSum += car.getSpeed();
            wayLength -= (car.getSpeed()/3.6) * timePassed;
            System.out.println(car.getSpeed() + " " + wayLength);
            System.out.println("До конца осталось " + wayLength/(speed/3.6) + " секунд");

        }
        System.out.println("Average speed = " + speedSum/segments);
        System.out.println("Passed " + segments + " seconds");
        exec.shutdown();
    }
}