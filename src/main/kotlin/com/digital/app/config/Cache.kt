package com.digital.app.config

import com.digital.app.constants.AppConstants.Companion.CACHE_NAME
import com.github.benmanes.caffeine.cache.Caffeine
import org.springframework.cache.CacheManager
import org.springframework.cache.caffeine.CaffeineCacheManager
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.time.Duration

@Configuration
open class Cache {

   @Bean
    open fun cacheManager(): CacheManager {
        val cacheManager = CaffeineCacheManager(CACHE_NAME)
       cacheManager.setCaffeine(Caffeine.newBuilder().initialCapacity(200).expireAfterWrite(Duration.ofSeconds(3600)))

       return cacheManager

    }
}