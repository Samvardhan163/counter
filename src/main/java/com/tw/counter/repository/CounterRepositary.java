package com.tw.counter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CounterRepositary extends JpaRepository<Counter, Long> {

}
