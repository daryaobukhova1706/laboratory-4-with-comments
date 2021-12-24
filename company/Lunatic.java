package com.company;

import java.util.Objects;

/*Класс для персонажа Лунатика*/
public class Lunatic {
    private String giveDrink(){
        return " дали попить ";
    }

    private String comeToSenses(){
        return Time.MEANTIME.getTimeName()+Characters.LUNATIC.getName()+Time.ULTIMATELY.getTimeName()+"пришёл в себя. ";
    }

    private String farAway(int dist) throws DistanceRuntimeException{
        if (dist > 10){
            throw new DistanceRuntimeException();
        }
        else return "неподалёку отсюда, ";
    }

    public class Kolosok implements KolosokInterface{ //вложенный нестатический класс для персонажа Колоска с описанием его поведения

        InterfaceAsking asking = new InterfaceAsking() { // Анонимный класс
            @Override
            public String ask() { // Переопределяем метод ask и возвращаем метод Лунатика farAway
                return Lunatic.this.farAway(4) + Time.LATER.getTimeName()+" попросил, ";
            }
        };

        class Water{ //Локальный класс для воды
            public String waterTitle = "водички."; //Поле для воды
            public String giveWater(){ // Метод, вызывающий метод из интерфейса и метод giveDrink
                return asking.ask() + "чтоб ему" + giveDrink() + waterTitle;
            }
        }
        Water water = new Water();

        public void nameIsNotKolosok(Characters k){ //Метод с обработкой исключения
            try{
                if (Objects.equals(k.getName(),"Колосок")){
                    System.out.println("зовут Колосок и он живёт в деревне Нееловке ");
                }
                else {
                    throw new NotKolosokException("зовут не Колосок и он не живёт в деревне Нееловке. Поэтому коротышки не смогли добраться!");
                }
            } catch (NotKolosokException e) {
                System.out.println(e.getMessage());
                System.exit(0);
            }
        }

        public String inform(){ // Метод, вызывающий метод Лунатик и имена Лунатика и Колоска
            return Lunatic.this.comeToSenses()+ Characters.LUNATIC.getName() + " сообщил " + Characters.ASTRONAUTS.getName() + ", что его ";
        }

        public String informWater(){ // Метод, вызывающий метод локального класса водичка
            return water.giveWater();
        }

        public String smile(FunctionalInterfaceEmotionHappiness happiness){ // Метод с параметром в лице функционального интерфейса
            return Characters.KOLOSOK.getName() + " засиял" + happiness.getHappiness();
        }

        private String duffelBag = " вещевой мешок";

        private String getDuffelBag() {
            return this.duffelBag;
        }
        public String hear(){ // Метод для описания действия: слышать
            return "не слыхал ли "+Characters.KOLOSOK.getName()+" чего-нибудь о "+ Characters.DUNNO.getName() + " с " + Characters.ROLYPOLY.getName();
        }

        private String onTheWayBack = "в обратный путь.";
        private String behindTheBack = " за спину";

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Kolosok kolosok = (Kolosok) o;
            return Objects.equals(onTheWayBack, kolosok.onTheWayBack) && Objects.equals(behindTheBack, kolosok.behindTheBack);
        }

        @Override
        public int hashCode() {
            return Objects.hash(onTheWayBack, behindTheBack)*31;
        }

        @Override
        public String put() { // Метод для описания действия: положить
            return Time.FINALLY.getTimeName() + Characters.KOLOSOK.getName() + " приладил" + getDuffelBag() + behindTheBack;
        }

        @Override
        public String getReady() { // Метод для описания действия: собраться
            return " и собрался " + onTheWayBack;
        }

        public String walkSinging (FunctionalInterfaceEmotionHappiness happiness) { // Метод с параметром в лице функционального интерфейса
            return Characters.KOLOSOK.getName() + " ушёл, напевая" + happiness.getHappiness();
        }
    }

}