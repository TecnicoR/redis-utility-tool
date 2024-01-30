package com.redisutilitytool.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.lettuce.core.RedisClient;
import io.lettuce.core.RedisURI;
import io.lettuce.core.api.sync.RedisCommands;
import io.lettuce.core.codec.StringCodec;
import io.lettuce.core.masterreplica.MasterReplica;
import io.lettuce.core.masterreplica.StatefulRedisMasterReplicaConnection;
import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class RedisConfig {
  @Value( "${spring.data.redis.host}" )
  private String redisHost;
  @Value( "${spring.data.redis.port}" )
  private Integer redisPort;

  @Bean
  public RedisCommands<String, String> redisReactiveCommands() {
    RedisURI redisURI = RedisURI.create( redisHost, redisPort );
    RedisClient redisClient = RedisClient.create( redisURI );
    StatefulRedisMasterReplicaConnection<String, String> connect = MasterReplica.connect( redisClient, StringCodec.UTF8,
        redisURI );
    log.info( "Attempting Redis connection - Host: {}, Port: {}, Connection Status: {}", redisURI.getHost(),
        redisURI.getPort(), connect.isOpen() ? "Successfully Connected" : "Not Connected" );
    return connect.sync();
  }
}
