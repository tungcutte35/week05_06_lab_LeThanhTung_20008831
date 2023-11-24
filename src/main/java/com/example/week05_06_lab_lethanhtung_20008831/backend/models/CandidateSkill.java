package com.example.week05_06_lab_lethanhtung_20008831.backend.models;

import com.example.week05_06_lab_lethanhtung_20008831.backend.enums.SkillLevel;
import com.example.week05_06_lab_lethanhtung_20008831.backend.ids.CandidateSkillPK;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "candidate_skill")
@IdClass(CandidateSkillPK.class)
public class CandidateSkill {
    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

    @Column(name = "skill_level", nullable = false)
    private SkillLevel skillLevel;

    @Id
    @ManyToOne
    @JoinColumn(name = "can_id")
    private Candidate candidate;

    @Column(name = "more_infos", length = 1000)
    private String moreInfo;

}
