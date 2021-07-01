package com.numbers_matter;

import com.sun.org.apache.xerces.internal.util.SymbolTable;

public class PlayerTestDrive {

    public static void main(String[] args) {

        System.out.println(Player.playerCount);
        Player one = new Player("Tiger woods");
        System.out.println(Player.playerCount);

    }
}
