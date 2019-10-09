package com.jindanupajit.javabootcamp.exercise3041.repository;

import com.jindanupajit.javabootcamp.exercise3041.entity.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long> {
}
