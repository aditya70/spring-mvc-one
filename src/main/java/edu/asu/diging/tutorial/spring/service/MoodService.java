package edu.asu.diging.tutorial.spring.service;

import edu.asu.diging.tutorial.spring.domain.Mood;

public class MoodService {
    
    public Mood getCurrentMood() {
        return new Mood("happy");
    }
    
}
