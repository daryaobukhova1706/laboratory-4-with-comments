package com.company;

/* Данный класс создан для имён всех персонажей текста*/
public enum Characters {
    DOONO("Знайка"),
    DUNNO("Незнайке"),
    KOLOSOK("Колосок"),
    ROLYPOLY("Пончиком."),
    SHORTMEN("коротышки"),
    LUNATIC("Лунатик"),
    ASTRONAUTS("космонавтам");

    private String name;
    public String getName(){ // Метод "выдающий" имена выше
        return this.name;
    }

    Characters(String name) {
        this.name= name;
    }

    @Override
    public String toString() { // Переопределяем метод и возращаем объект в виде строки
        return name;
    }
}
