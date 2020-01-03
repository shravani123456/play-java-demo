package package1;

import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Singleton;
import java.util.concurrent.atomic.AtomicInteger;
@Singleton
public class AtomicCounter extends Controller {
    private AtomicInteger counter=new AtomicInteger();

    public Integer getCurrentCount(){
        // counter++;
        return counter.getAndIncrement();
    }
}
