package com.company;


public class Shoots extends Seeds {
    private String typeOfSeeds = " всходами.";

    @Override
    public String getTypeOfSeeds(){
        return typeOfSeeds;
    }

    @Override
    public String toString() {
        return typeOfSeeds;
    }
}
