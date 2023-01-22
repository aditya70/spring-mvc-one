package edu.asu.diging.tutorial.spring.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import edu.asu.diging.tutorial.spring.domain.Mood;

@Service
public class MoodService implements MoodServiceInterface {

    private List<String> moods = Arrays.asList("happy", "energetic", "excited", "sad");
    private List<Mood> moodList = new ArrayList<>();

    @PostConstruct
    public void init() {
        for (String mood : moods) {
            moodList.add(new Mood(mood));
        }
    }

    @Override
    public Mood getCurrentMood() {
        int randomIndex = new Random().nextInt(moodList.size());
        return moodList.get(randomIndex);
    }

}
