package com.redisutilitytool.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.lettuce.core.RedisClient;
import io.lettuce.core.RedisURI;
import io.lettuce.core.api.sync.RedisCommands;
import io.lettuce.core.codec.StringCodec;
import io.lettuce.core.masterreplica.MasterReplica;

@Configuration
public class RedisConfig {
  @Value( "${spring.data.redis.host}" )
  private String redisHost;
  @Value( "${spring.data.redis.port}" )
  private Integer redisPort;

  @Bean
  public RedisCommands<String, String> redisReactiveCommands() {
    return MasterReplica.connect( RedisClient.create(), StringCodec.UTF8, RedisURI.create( redisHost, redisPort ) )
        .sync();
  }
}
