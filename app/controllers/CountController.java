package controllers;


import package1.AtomicCounter;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.concurrent.atomic.AtomicInteger;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class CountController extends Controller {
   private AtomicCounter counter;

   @Inject
    public  CountController(AtomicCounter c) {

       counter = c;
  }
   public Result getCurrentCount(){
      // counter++;
       return ok("count "+counter.getCurrentCount());
   }

}
