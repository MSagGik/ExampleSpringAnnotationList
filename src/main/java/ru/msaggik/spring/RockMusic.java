package ru.msaggik.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("someRockMusic") // создание бина к классу с id someRockMusic
public class RockMusic implements Music{
    private List<String> songs = new ArrayList<>();

    // Блок инициализации объекта
    // Выполняется каждый раз, когда создается объект класса
    {
        songs.add("Earthlings Grass near the house");
        songs.add("Paint it black");
        songs.add("Can't seem to make you mine");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
