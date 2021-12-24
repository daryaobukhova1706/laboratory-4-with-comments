package com.company;

/*Класс для земных семян, наследников обычных семян*/
public class GroundSeeds extends Seeds {
    private String typeOfSeeds = " земные семена";

    @Override
    public String getTypeOfSeeds(){ //Метод для возврата названия(типа) семян
        return typeOfSeeds;
    }

    @Override
    public String toString() { // Переопределяем метод и возращаем объект в виде строки
        return typeOfSeeds;
    }
}
