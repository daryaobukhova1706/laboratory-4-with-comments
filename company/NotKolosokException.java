package com.company;

/*Класс для исключения*/
public class NotKolosokException extends Exception{
    public NotKolosokException(String message){ // Метод с параметром message
        super(message);
    }
}
