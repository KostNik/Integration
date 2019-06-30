package com.edu.sandbox.weather.cache;

import com.edu.sandbox.weather.domain.WeatherPrediction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class RedisCacheAdapter implements CacheAdapter<WeatherCacheKey, WeatherPrediction> {

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public void addToCache(WeatherCacheKey weatherCacheKey, WeatherPrediction weatherPrediction) {
        
    }

    @Override
    public void invalidate(List<WeatherCacheKey> weatherCacheKeys) {

    }

    @Override
    public Optional<WeatherPrediction> retrieve(WeatherCacheKey weatherCacheKey) {
        return Optional.empty();
    }
}
