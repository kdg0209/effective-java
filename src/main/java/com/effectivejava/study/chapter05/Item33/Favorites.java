package com.effectivejava.study.chapter05.Item33;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Favorites {

    private Map<Class<?>, Object> favorites = new HashMap<>();
    public <T> void putFavorites(Class<T> type, T instance) {
        favorites.put(Objects.requireNonNull(type), type.cast(instance));
    }
    public <T> T getFavorites(Class<T> type) {
        return type.cast(favorites.get(type));
    }
}
