package com.example.week05_06_lab_lethanhtung_20008831.backend.respositories;

import com.example.week05_06_lab_lethanhtung_20008831.backend.models.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}