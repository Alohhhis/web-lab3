package com.example.weblab3.DB;

import java.util.List;

public interface DB <T>{
    void clear();
    List<T> getAll();
    void add(T entity);
    boolean isEmpty();
}
