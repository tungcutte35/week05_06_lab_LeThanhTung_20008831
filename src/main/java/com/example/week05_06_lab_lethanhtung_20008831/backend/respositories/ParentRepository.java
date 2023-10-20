package com.example.week05_06_lab_lethanhtung_20008831.backend.respositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentRepository<T> extends CrudRepository<T, Long> { }