package com.example.week05_06_lab_lethanhtung_20008831.backend.enums;

public enum SkillLevel {
    BEGINNER(1),
    IMTERMEDIATE(2),
    ADVANCED(3),
    PROFESSIONAL(4),
    MASTER(5);

    private int value;

    SkillLevel(int value){
        this.value = value;
    }
}
