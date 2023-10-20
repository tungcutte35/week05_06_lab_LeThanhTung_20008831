package com.example.week05_06_lab_lethanhtung_20008831.backend.models;

import com.example.week05_06_lab_lethanhtung_20008831.backend.enums.SkillLevel;
import com.example.week05_06_lab_lethanhtung_20008831.backend.ids.CandidateSkillPK;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Data
@IdClass(CandidateSkillPK.class)
@Table(name = "candidate_skill")
public class CandidateSkill {
    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

    @Id
    @ManyToOne
    @JoinColumn(name = "can_id", nullable = false)
    private Candidate candidate;

    @Enumerated(EnumType.STRING)
    private SkillLevel skillLevel;
    private String moreInfos;
}
