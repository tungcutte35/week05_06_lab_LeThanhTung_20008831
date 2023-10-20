package com.example.week05_06_lab_lethanhtung_20008831.backend.services.impl;

import com.example.week05_06_lab_lethanhtung_20008831.backend.services.ParentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParentServicesImpl<T> implements ParentServices<T> {
    @Autowired
    protected ParentServices<T> service;
    @Override
    public List<T> getAll() {
        return service.getAll();
    }

    @Override
    public void save(T obj) {
        service.save(obj);
    }

    @Override
    public void delete(T id) {
        service.delete(id);
    }

    @Override
    public Optional<T> findById(Long id) {
        return service.findById(id);
    }
}