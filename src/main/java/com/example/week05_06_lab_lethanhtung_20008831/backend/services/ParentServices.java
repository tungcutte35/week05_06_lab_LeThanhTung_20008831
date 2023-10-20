package com.example.week05_06_lab_lethanhtung_20008831.backend.services;

import java.util.List;
import java.util.Optional;

public interface ParentServices<T> {
    List<T> getAll();

    void save(T obj);

    void delete(T id);

    Optional<T> findById(Long id);
}