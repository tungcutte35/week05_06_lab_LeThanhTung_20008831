package com.example.week05_06_lab_lethanhtung_20008831.backend.models;

import com.example.week05_06_lab_lethanhtung_20008831.backend.enums.SkillLevel;
import com.example.week05_06_lab_lethanhtung_20008831.backend.ids.CandidateSkillPK;
import com.example.week05_06_lab_lethanhtung_20008831.backend.ids.JobSkillPK;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "job_skill")
@IdClass(JobSkillPK.class)
public class JobSkill {
    @Column(name = "skill_level", nullable = false)
    private SkillLevel skillLevel;

    @Id
    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;

    @Column(name = "more_infos", length = 1000)
    private String moreInfo;

    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

}
