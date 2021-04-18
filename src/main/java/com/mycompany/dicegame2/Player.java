package com.mycompany.dicegame2;

/**
 * класс, который содержит основные хар-ки игрока
 */
public class Player {
    public final String name;
    public int winsNumber;
    
    public int lastRollValue;
    
    public Player(String name){
        this.name = name;
        winsNumber = 0;
        lastRollValue = 0;
    }     
}
