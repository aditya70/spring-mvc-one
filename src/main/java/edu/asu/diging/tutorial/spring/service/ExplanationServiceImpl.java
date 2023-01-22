package edu.asu.diging.tutorial.spring.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class ExplanationServiceImpl implements ExplanationService {

    private static Map<String, String> moodMap = new HashMap<>();

    static {
        moodMap.put("happy", "I have joined diging");
        moodMap.put("energetic", "I had energy drink");
        moodMap.put("excited", "There is football match in ASU");
        moodMap.put("sad", "Weather is not good");
    }

    @Override
    public String getMoodExplanation(String mood) {
        return moodMap.get(mood);
    }

}
