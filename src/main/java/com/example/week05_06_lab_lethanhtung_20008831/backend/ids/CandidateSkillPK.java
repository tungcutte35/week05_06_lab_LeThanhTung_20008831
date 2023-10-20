package com.example.week05_06_lab_lethanhtung_20008831.backend.ids;
import com.example.week05_06_lab_lethanhtung_20008831.backend.models.Candidate;
import com.example.week05_06_lab_lethanhtung_20008831.backend.models.Skill;

import java.io.Serializable;

public class CandidateSkillPK implements Serializable {
    private Skill skill;
    private Candidate candidate;

    public CandidateSkillPK() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CandidateSkillPK that = (CandidateSkillPK) o;
        if (!skill.equals(that.skill)) return false;
        return candidate.equals(that.candidate);
    }

    @Override
    public int hashCode() {
        int result = skill.hashCode();
        result = 31 * result + candidate.hashCode();
        return result;
    }
}
