package com.company;

/*Класс созданный для разных семян */
public class DifferentSeeds extends Seeds{
    private String typeOfSeeds = " разных семян";

    @Override
    public String getTypeOfSeeds(){ //Метод выводит фразу "разных семян"
        return typeOfSeeds;
    }

    @Override
    public String toString() { // Переопределяем метод и возращаем объект в виде строки
        return typeOfSeeds;
    }
}
