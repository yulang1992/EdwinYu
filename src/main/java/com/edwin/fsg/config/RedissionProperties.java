package com.edwin.fsg.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.client.codec.Codec;
import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import io.netty.channel.nio.NioEventLoopGroup;

@Configuration
@PropertySource(value= {"classpath:redission.properties"})
public class RedissionProperties {
    
	@Value("${spring.redissson.address}")
    private String address;
	@Value("${spring.redisson.connectionMinimumIdleSize}")
    private int connectionMinimumIdleSize = 10;
	@Value("${spring.redisson.idleConnectionTimeout}")
    private int idleConnectionTimeout=10000;
	@Value("${spring.redisson.pingTimeout}")
    private int pingTimeout=1000;
	@Value("${spring.redisson.connectTimeout}")
    private int connectTimeout=10000;
	@Value("${spring.redisson.timeout}")
    private int timeout=3000;
	@Value("${spring.redisson.retryAttempts}")
    private int retryAttempts=3;
	@Value("${spring.redisson.retryInterval}")
    private int retryInterval=1500;
	@Value("${spring.redisson.reconnectionTimeout}")
    private int reconnectionTimeout=3000;
	@Value("${spring.redisson.failedAttempts}")
    private int failedAttempts=3;
	//@Value("${spring.redisson.password}")
    private String password = null;
	@Value("${spring.redisson.subscriptionsPerConnection}")
    private int subscriptionsPerConnection=5;
	//@Value("${spring.redisson.clientName}")
    private String clientName=null;
	@Value("${spring.redisson.subscriptionConnectionMinimumIdleSize}")
    private int subscriptionConnectionMinimumIdleSize = 1;
	@Value("${spring.redisson.subscriptionConnectionPoolSize}")
    private int subscriptionConnectionPoolSize = 50;
	@Value("${spring.redisson.connectionPoolSize}")
    private int connectionPoolSize = 64;
	@Value("${spring.redisson.database}")
    private int database = 0;
	@Value("${spring.redisson.dnsMonitoring}")
    private boolean dnsMonitoring = false;
	@Value("${spring.redisson.dnsMonitoringInterval}")
    private int dnsMonitoringInterval = 5000;
    
    @Value("${spring.redisson.thread}")
    private int thread; //当前处理核数量 * 2

    private String codec="org.redisson.codec.JsonJacksonCodec";

    @Bean(destroyMethod = "shutdown")
    public RedissonClient redisson() throws Exception {
        Config config = new Config();
          config.useSingleServer().setAddress(address.trim())
                .setConnectionMinimumIdleSize(connectionMinimumIdleSize)
                .setConnectionPoolSize(connectionPoolSize)
                .setDatabase(database)
                .setDnsMonitoring(dnsMonitoring)
                .setDnsMonitoringInterval(dnsMonitoringInterval)
                .setSubscriptionConnectionMinimumIdleSize(subscriptionConnectionMinimumIdleSize)
                .setSubscriptionConnectionPoolSize(subscriptionConnectionPoolSize)
                .setSubscriptionsPerConnection(subscriptionsPerConnection)
                .setClientName(clientName)
                .setFailedAttempts(failedAttempts)
                .setRetryAttempts(retryAttempts)
                .setRetryInterval(retryInterval)
                .setReconnectionTimeout(reconnectionTimeout)
                .setTimeout(timeout)
                .setConnectTimeout(connectTimeout)
                .setIdleConnectionTimeout(idleConnectionTimeout)
                .setPingTimeout(pingTimeout)
                .setPassword(password);
        Codec code =(Codec) Class.forName(codec).newInstance();
       // Codec codec=(Codec)ClassUtils.forName(getCodec(),ClassUtils.getDefaultClassLoader()).newInstance();
        config.setCodec(code);
        config.setThreads(thread);
        config.setEventLoopGroup(new NioEventLoopGroup());
        config.setUseLinuxNativeEpoll(false);
        return	Redisson.create(config);	
}
    
//    private RedissonClient redisson = null;
//
//    public RedissonClient getRedisson() {
//        return redisson;
//    }
}
