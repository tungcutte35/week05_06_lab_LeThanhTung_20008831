package com.example.week05_06_lab_lethanhtung_20008831.backend.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Data
@Table(name = "experience")
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "exp_id")
    private long id;
    private LocalDate toDate;
    private LocalDate fromDate;
    private String companyName;
    private String role;
    private String workDescription;

    @ManyToOne
    @JoinColumn(name = "can_id")
    private Candidate candidate;

}
