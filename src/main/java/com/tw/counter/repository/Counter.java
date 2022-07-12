package com.tw.counter.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Counter {
    @Id
    private Long id;

    @Column
    private int counter;

    public Counter(int counter) {
        this.counter = counter;
    }
    public Counter() {
       super();
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public Long getId() {
        return id;
    }

    public int getCounter() {
        return counter;
    }
}
