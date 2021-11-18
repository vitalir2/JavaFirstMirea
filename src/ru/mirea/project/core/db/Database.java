package ru.mirea.project.core.db;

import java.util.HashMap;
import java.util.Map;

// TODO: Change to singleton
public class Database<K, V> {

    private static final String DEFAULT_NAME = "db";

    protected String name;
    private final Map<K, V> store;

    public Database() {
        name = DEFAULT_NAME;
        store = new HashMap<>();
    }

    public void add(K key, V value) {
        store.put(key, value);
    }
    public void delete(K key, V value) {
        store.remove(key, value);
    }

    public V get(K key) {
        return store.get(key);
    }
    // Add some queries like SQL?

    public String getName() {
        return name;
    }
}
