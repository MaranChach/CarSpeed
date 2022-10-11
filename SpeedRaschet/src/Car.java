import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Car{
    private Integer speed;

    public void setSpeed(Integer speed){
        this.speed = speed;
    }

    public void setRandomSpeed(){
        this.speed = new Random().nextInt(1, 100);
    }

    public int getSpeed(){
        return speed;
    }
}
