package com.example.week05_06_lab_lethanhtung_20008831.backend.models;

import com.example.week05_06_lab_lethanhtung_20008831.backend.enums.SkillType;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "skill")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    private long id;

    @Column(name = "skill_name", nullable = false, length = 150)
    private String skillName;

    @Column(name = "skill_type", nullable = false)
    private SkillType type;

    @Column(name = "skill_dec", nullable = false, length = 300)
    private String skillDescription;

    //  ==========================RELATIONSHIP====================================
    @OneToMany(mappedBy = "skill")
    private List<JobSkill> jobSkills;

}
