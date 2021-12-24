package com.company;

// Главный класс. В нём выводится история
public class Main {

    public static void main(String[] args) { //в методе набора нужные объекты классов
        Doono doono = new Doono();
        Lunatic lunatic = new Lunatic();
        Lunatic.Kolosok kolosok = lunatic.new Kolosok();
        Shortmen shortmen = new Shortmen();
        Shortmen.Stocks stocks = new Shortmen.Stocks();
        DifferentSeeds differentSeeds=new DifferentSeeds();
        Shoots shoots = new Shoots();
        GroundSeeds groundSeeds = new GroundSeeds();
        FunctionalInterfaceEmotionHappiness happiness;
        happiness = ()-> " от радости."; //Лямбда-выражение возвращает фразу "от радости"

        System.out.print(kolosok.inform());
        kolosok.nameIsNotKolosok(Characters.KOLOSOK);
        System.out.println(kolosok.informWater());
        System.out.println(stocks.buyAndSell());
        System.out.println(doono.doonoKnowAndUnderstand());
        System.out.println(kolosok.smile(happiness));
        System.out.println(doono.orderToPrepare()+doono.orderToPrepare(differentSeeds)+doono.beginToAsk()+kolosok.hear());
        System.out.println(shortmen.bring(differentSeeds));
        System.out.println(doono.explainHowToPlant()+doono.explainHowToPlant(groundSeeds)+doono.explainHowToCare()+doono.explainHowToCare(shoots));
        System.out.println(kolosok.put()+kolosok.getReady());
        System.out.println(kolosok.walkSinging(happiness));

    }
}
