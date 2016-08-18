package com.tiy.hospital;

import java.util.Random;

/**
 * Created by fenji on 8/17/2016.
 */
public class Disease {
    public static final String ALLERGIES = "111";
    public static final String MILD_INFECTION = "112";
    public static final String BAD_INFECTION = "113";
            
    public static final String BROKEN_BONE = "121";
    public static final String SKIN_GROWTH = "122";
    public static final String HERNIA = "123";
            
    public static final String CANCER_STAGE_1 = "211";
    public static final String CANCER_STAGE_2 = "212";
            
    public static final String CANCER_STAGE_3 = "223";
    public static final String CANCER_STAGE_4 = "224";
            
    public static final String HIGH_BLOOD_PRESSURE = "311";
    public static final String HIGH_CHOLESTEROL = "312";
    public static final String HEART_ATTACK_RISK = "313";
            
    public static final String CLOGGED_ARTERY = "321";
    public static final String ANEURISM = "322";
    public static final String ARRHYTHMIA = "323";

    public static String generateDisease(){
        String[] diseaseList = new  String[] {ALLERGIES, MILD_INFECTION, BAD_INFECTION, BROKEN_BONE,
                SKIN_GROWTH, HERNIA, CANCER_STAGE_1, CANCER_STAGE_2, CANCER_STAGE_3, CANCER_STAGE_4,
                HIGH_BLOOD_PRESSURE, HIGH_CHOLESTEROL, HEART_ATTACK_RISK, CLOGGED_ARTERY, ANEURISM, ARRHYTHMIA};
        return diseaseList[(int)(Math.random() * 16)];
    }
}
