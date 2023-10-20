package com.example.week05_06_lab_lethanhtung_20008831.backend.models;

import com.example.week05_06_lab_lethanhtung_20008831.backend.enums.SkillType;
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
@Table(name = "skill")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    private long id;
    private SkillType type;
    private String skillName;
    private String skillDescription;

    @OneToMany
    @JoinColumn(name = "skill_id")
    private List<JobSkill> jobSkills;

}
