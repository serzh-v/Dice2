package com.mycompany.dicegame2;

/**
 * класс, в котором можно ввести параметры игры
 */
public class Main {
    
    public static void main(String [] args) {
        Playable myGame = new Game(4,"Сергей", "Андрей", "Computer");
        myGame.play();
    }
}
