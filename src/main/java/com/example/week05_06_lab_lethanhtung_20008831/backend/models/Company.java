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
@Table(name = "company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "com_id")
    private long id;
    private String name;
    private String about;
    private String phone;
    private String webURL;
    private String email;

    @OneToOne
    @JoinColumn(name = "add_id", nullable = false)
    private Address address;

    @OneToMany(mappedBy = "job_id", fetch = FetchType.LAZY)
    private List<Job> jobs;

}
