package com.rocks.distributed_lovable.account_service;

import com.rocks.distributed_lovable.common_lib.error.GlobalExceptionHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccountServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountServiceApplication.class, args);
        GlobalExceptionHandler globalExceptionHandler = new GlobalExceptionHandler();
    }

}
