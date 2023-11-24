package com.example.week05_06_lab_lethanhtung_20008831.backend.respositories;

import com.example.week05_06_lab_lethanhtung_20008831.backend.models.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}
