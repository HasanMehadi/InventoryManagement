package com.org.inventorymanagement.Configurations;


/*import org.ehcache.config.CacheConfiguration;
import org.ehcache.config.builders.CacheConfigurationBuilder;
import org.ehcache.config.builders.ResourcePoolsBuilder;
import org.ehcache.config.units.MemoryUnit;
import org.ehcache.expiry.Duration;
import org.ehcache.expiry.Expirations;
import org.ehcache.jsr107.Eh107Configuration;*/
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.config.CacheConfiguration;
import org.springframework.cache.annotation.CachingConfigurer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.interceptor.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
@ComponentScan(basePackages = "com.org.inventorymanagement")
public class EhCacheConfig implements CachingConfigurer {

    /*@Bean
    public JCacheManagerCustomizer jCacheManagerCustomizer() {
        return cm -> {
            cm.createCache("users", cacheConfiguration());

        };
    }

    private javax.cache.configuration.Configuration<Object, Object> cacheConfiguration() {
        CacheConfiguration<Object, Object> cacheConfiguration = CacheConfigurationBuilder.newCacheConfigurationBuilder(
                Object.class, Object.class,
                ResourcePoolsBuilder.newResourcePoolsBuilder()
                        .heap(300, MemoryUnit.MB)
                        .build()
        )
                .withExpiry(Expirations.timeToLiveExpiration(new Duration(1, TimeUnit.HOURS)))
                .withExpiry(Expirations.timeToIdleExpiration(new Duration(10, TimeUnit.MINUTES)))
                .build();

        return Eh107Configuration.fromEhcacheCacheConfiguration(cacheConfiguration);
    }*/

    @Bean(destroyMethod = "shutdown")
    public CacheManager ehCacheManager(){
        CacheConfiguration cacheConfiguration = new CacheConfiguration();
        cacheConfiguration.setName("brands");
        cacheConfiguration.setName("currencies");
        cacheConfiguration.setMemoryStoreEvictionPolicy("LRU");
        cacheConfiguration.setMaxEntriesLocalHeap(300);
        cacheConfiguration.clearOnFlush(true);
        cacheConfiguration.setTimeToIdleSeconds(600);
        cacheConfiguration.setTimeToLiveSeconds(3600);
        net.sf.ehcache.config.Configuration configuration = new net.sf.ehcache.config.Configuration();
        configuration.addCache(cacheConfiguration);
        return CacheManager.newInstance(configuration);
    }


    @Override
    public org.springframework.cache.CacheManager cacheManager() {
        return new EhCacheCacheManager(ehCacheManager());
    }

    @Override
    public CacheResolver cacheResolver() {
        return new SimpleCacheResolver();
    }

    @Override
    public KeyGenerator keyGenerator() {
        return new SimpleKeyGenerator();
    }

    @Override
    public CacheErrorHandler errorHandler() {
        return new SimpleCacheErrorHandler();
    }
}
