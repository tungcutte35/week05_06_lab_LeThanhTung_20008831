package com.example.week05_06_lab_lethanhtung_20008831.backend.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Data
@Table(name = "job")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id")
    private long id;
    private String name;
    private  String description;

    @ManyToOne
    @JoinColumn(name = "com_id",nullable = false)
    private Company company;

    @OneToMany
    @JoinColumn(name = "job_id",nullable = false)
    private List<JobSkill> jobSkills;
}
