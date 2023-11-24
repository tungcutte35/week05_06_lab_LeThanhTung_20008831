package com.example.week05_06_lab_lethanhtung_20008831.backend.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "com_id")
    private long id;

    @Column(name = "comp_name", nullable = false)
    private String name;

    @Column(name = "about", length = 2000)
    private String about;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "web_url")
    private String webURL;

    @Column(name = "email", nullable = false)
    private String email;

    @OneToOne
    @JoinColumn(name = "address", nullable = false)
    private Address address;

    @OneToMany(mappedBy = "company")
    private List<Job> jobs;

}
