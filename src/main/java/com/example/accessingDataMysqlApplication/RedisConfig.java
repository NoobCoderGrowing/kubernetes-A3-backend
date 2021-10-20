package com.example.accessingDataMysqlApplication;
import io.lettuce.core.RedisClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RedisConfig {

    @Bean
    public RedisClient getRedisCommands() {
        RedisClient client = RedisClient.create(String.format("redis://%s:%d/0", "10.48.0.200", 6379));
        return client;
    }
}
