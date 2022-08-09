package ru.msaggik.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component // создание бина к классу с id techno
public class TechnoMusic implements Music{
    private List<String> songs = new ArrayList<>();

    // Блок инициализации объекта
    // Выполняется каждый раз, когда создается объект класса
    {
        songs.add("Daft Punk Outlands");
        songs.add("Tiësto with. Sneaky Sound System I Will Be Here");
        songs.add("The Chemical Brothers Block rockin' beats");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}