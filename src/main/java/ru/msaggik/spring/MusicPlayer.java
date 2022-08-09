package ru.msaggik.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private TechnoMusic technoMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, TechnoMusic technoMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.technoMusic = technoMusic;
    }

    public void playMusic(MusicEnum generation) {
        Random random = new Random();

        // случайное целое число в интервале [0,2]
        int randomNumber = random.nextInt(3);

        if (generation == MusicEnum.CLASSICAL) {
            // случайная классическая песня
            System.out.println(classicalMusic.getSongs().get(randomNumber));
        } else if(generation == MusicEnum.TECHNO) {
            // случайная техно песня
            System.out.println(technoMusic.getSongs().get(randomNumber));
        } else {
            // случайная рок песня
            System.out.println(rockMusic.getSongs().get(randomNumber));
        }
    }
}