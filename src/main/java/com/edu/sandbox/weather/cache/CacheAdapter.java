package com.edu.sandbox.weather.cache;

import java.util.List;
import java.util.Optional;

public interface CacheAdapter<Key, Value> {

    void addToCache(Key key, Value value);

    void invalidate(List<Key> keys);

    Optional<Value> retrieve(Key key);

}
