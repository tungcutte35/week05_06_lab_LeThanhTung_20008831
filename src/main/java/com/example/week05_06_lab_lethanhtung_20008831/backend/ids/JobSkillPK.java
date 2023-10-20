package com.example.week05_06_lab_lethanhtung_20008831.backend.ids;

import com.example.week05_06_lab_lethanhtung_20008831.backend.models.Job;
import com.example.week05_06_lab_lethanhtung_20008831.backend.models.Skill;

import java.io.Serializable;

public class JobSkillPK implements Serializable {
    private Skill skill;
    private Job job;

    public JobSkillPK() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobSkillPK that = (JobSkillPK) o;
        if (!skill.equals(that.skill)) return false;
        return job.equals(that.job);
    }

    @Override
    public int hashCode() {
        int result = skill.hashCode();
        result = 31 * result + job.hashCode();
        return result;
    }
}
