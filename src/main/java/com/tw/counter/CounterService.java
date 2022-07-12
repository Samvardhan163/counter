package com.tw.counter;

import com.tw.counter.repository.Counter;
import com.tw.counter.repository.CounterRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CounterService {
    @Autowired
    private CounterRepositary counterRepositary;

    public Counter getCounter() {
        return counterRepositary.findById(0L).get();
    }

}
