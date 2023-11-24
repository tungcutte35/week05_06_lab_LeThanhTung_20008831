package com.example.week05_06_lab_lethanhtung_20008831.backend.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "job")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id")
    private long id;

    @Column(name = "job_name", nullable = false)
    private String name;

    @Column(name = "job_dec", length = 2000, nullable = false)
    private String description;
    //====================RELATIONSHIS=================
    @ManyToOne
    @JoinColumn(name = "company")
    private Company company;

    @OneToMany(mappedBy = "job")
    private List<JobSkill> jobSkills;

}