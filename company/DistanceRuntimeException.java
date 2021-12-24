package com.company;

/* Класс с непроверяемым исключением */
public class DistanceRuntimeException extends RuntimeException{
    public String toString(){ // Метод возращает объект класса в виде строки
        return "Колосок живёт очень-очень далеко отсюда, поэтому он не смог связаться с остальными коротышками.";
    }
}
