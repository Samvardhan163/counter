package com.tw.counter.view;

import com.tw.counter.CounterService;
import com.tw.counter.repository.Counter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CounterController {
    @Autowired
    private CounterService counterService;
   @GetMapping("/api")
    private Counter getCounter()
   {
       return counterService.getCounter();
   }
}
