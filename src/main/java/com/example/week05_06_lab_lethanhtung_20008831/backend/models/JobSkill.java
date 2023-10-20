package com.example.week05_06_lab_lethanhtung_20008831.backend.models;

import com.example.week05_06_lab_lethanhtung_20008831.backend.enums.SkillLevel;
import com.example.week05_06_lab_lethanhtung_20008831.backend.ids.CandidateSkillPK;
import com.example.week05_06_lab_lethanhtung_20008831.backend.ids.JobSkillPK;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Data
@IdClass(JobSkillPK.class)
@Table(name = "job_skill")
public class JobSkill {

    @Enumerated(EnumType.STRING)
    private SkillLevel skillLevel;
    private  String moreInfo;

    @Id
    @ManyToOne()
    @JoinColumn(name = "job_id", nullable = false)
    private Job job;

    @Id
    @ManyToOne()
    @JoinColumn(name = "skill_id", nullable = false)
    private Skill skill;
}
