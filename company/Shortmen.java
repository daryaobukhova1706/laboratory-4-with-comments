package com.company;

/* Класс для персонажей Коротышки */
public class Shortmen {
    private static String stocks = " акции ";
    private static String nobody = "Никто из ";
    private static String buy(){
        return "покупать";
    }
    private static String sell(){
        return " или же продавать.";
    }

    private static String doNotUnderstand(){
        return " не понял";
    }

    public static class Stocks{ //Статический вложенный класс Акции
        public String buyAndSell(){  // Метод для описания действия: покупать и продавать
            return nobody + Characters.SHORTMEN.getName() + Shortmen.doNotUnderstand() + ", что это за" + stocks + "и как их можно " + Shortmen.buy() + Shortmen.sell();
        }
    }

    private String bigDuffelBag = " большой вещевой мешок, наполненный";

    private String getBigDuffelBag(){
        return this.bigDuffelBag;
    }

    public String bring(DifferentSeeds differentSeeds){  // Метод с параметром разных семян и описание действия: принести
        return Time.INTHETIME.getTimeName() + Characters.SHORTMEN.getName()+ " принесли" + getBigDuffelBag() + differentSeeds.getTypeOfSeeds() + ".";
    }

    @Override
    public String toString() { // Переопределяем метод и возращаем объект в виде строки
        return bigDuffelBag;
    }
}
