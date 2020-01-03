package controllers;
import package1.AtomicCounter;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.concurrent.atomic.AtomicInteger;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton

public class Count extends Controller{
    private AtomicCounter counter;

    @Inject
    public  Count(AtomicCounter counter) {
        this.counter = counter;
    }
    public Result getCurrentCount(){
        // counter++;
        return ok("count "+counter.getCurrentCount());
    }

}
