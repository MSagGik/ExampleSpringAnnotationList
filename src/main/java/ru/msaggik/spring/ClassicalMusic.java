package ru.msaggik.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component // создание бина к классу с id classicalMusic
public class ClassicalMusic implements Music {
    private List<String> songs = new ArrayList<>();

    // Блок инициализации объекта
    // Выполняется каждый раз, когда создается объект класса
    {
        songs.add("I.S. Bach Musette in D major");
        songs.add("Symphony no. 5 in C Minor, op. 67");
        songs.add("Night on Bald Mountain");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
