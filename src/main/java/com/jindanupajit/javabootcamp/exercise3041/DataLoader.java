package com.jindanupajit.javabootcamp.exercise3041;

import com.jindanupajit.javabootcamp.exercise3041.entity.Car;
import com.jindanupajit.javabootcamp.exercise3041.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    CarRepository carRepository;

    @Override
    public void run(String... strings) throws Exception {


        carRepository.save(
                new Car("2019", "Toyota", "4Runner")
        );

        carRepository.save(
                new Car("2010", "Toyota", "Rav4")
        );

        carRepository.save(
                new Car("2007", "Honda", "Accord")
        );

        carRepository.save(
                new Car("2009", "Honda", "Civic")
        );

    }
}
