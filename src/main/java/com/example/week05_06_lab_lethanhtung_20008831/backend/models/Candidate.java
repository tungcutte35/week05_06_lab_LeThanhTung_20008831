package com.example.week05_06_lab_lethanhtung_20008831.backend.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Data
@Table(name = "cadidate")
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "can_id")
    private long canId;
    private String phone;
    private LocalDate dob;
    private String email;
    private String fullName;

    @OneToOne
    @JoinColumn(name = "add_id")
    private Address address;

    @OneToMany
    @JoinColumn(name = "can_id")
    private List<CandidateSkill> candidateSkills;

    @OneToMany
    @JoinColumn(name = "exp_id",nullable = false)
    private List<Experience> experiences;


    public Candidate(String phone, LocalDate dob, String email, String fullName, Address address) {
        this.phone = phone;
        this.dob = dob;
        this.email = email;
        this.fullName = fullName;
        this.address = address;
    }
}
