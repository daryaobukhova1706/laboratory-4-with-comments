package com.company;

/*Класс перечисление времнных промежутков*/
public enum Time {
    INTHETIME("В это время "),
    FINALLY("Наконец "),
    MEANTIME("Тем временем "),
    LATER(" потом "),
    IMMEDIATLY("сразу "),
    ULTIMATELY(" окончательно ");


    private String timeName;
    public String getTimeName(){  // Метод "выдающий" время выше
        return this.timeName;
    }

    Time (String timeName) {
        this.timeName= timeName;
    }

    @Override
    public String toString() { // Переопределяем метод и возращаем объект в виде строки
        return timeName;
    }
}
