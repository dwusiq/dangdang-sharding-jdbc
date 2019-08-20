package com.wusiq.sharding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wusiq.sharding.mapper")
public class ShardingDatabaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingDatabaseApplication.class, args);
    }

}
