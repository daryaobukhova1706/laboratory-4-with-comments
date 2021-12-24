package com.company;

/* Класс для описания поведения персонажа Знайки*/
public class Doono implements DoonoInterface {

    private String smartMan(){
        return ", который знал очень многое, ";
    }

    public String doonoKnowAndUnderstand(){ //Метод для описания действий: знать и понимать
        return "Но " + Characters.DOONO + smartMan() + Time.IMMEDIATLY + "всё понял. ";
    }
    @Override
    public String orderToPrepare(){ //Метод для описания действий: велеть приготовить
        return Characters.DOONO.getName()+" велел приготовить "+Characters.SHORTMEN.getName();
    }

    public String orderToPrepare(DifferentSeeds differentSeeds){ //Метод, вызывающий метод getTypeOfSeeds и имя Колоска
        return differentSeeds.getTypeOfSeeds() + " для " + Characters.KOLOSOK.getName();
    }

    @Override
    public String beginToAsk() { //Метод для описания действия: расспрашивать
        return ", а сам стал расспрашивать,";
    }

    @Override
    public String explainHowToPlant() { //Метод, вызывающий имя Знайки и Колоска и описывающий действие: объяснять и сажать
        return Characters.DOONO.getName() + " объяснил " + Characters.KOLOSOK.getName() + ", как сажать";
    }

    public String explainHowToPlant(GroundSeeds groundSeeds){ //Метод, вызывающий метод getTypeOfSeeds для объекта земных
        return groundSeeds.getTypeOfSeeds();
    }

    @Override
    public String explainHowToCare() { //Метод для описания действия: ухаживать
        return " и как ухаживать за";
    }

    public String explainHowToCare(Shoots shoots) { //Метод, вызывающий метод getTypeOfSeeds для объекта всходов
        return shoots.getTypeOfSeeds();
    }

}
