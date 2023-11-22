package com.game;

/**
 * Define the Jugador class
 */
public class Jugador {
    // Define attributes
    private int positionX;
    private int positionY;

    // Define constructor
    private Jugador(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    // Define getters and setters
    public int getPositionX() {
        return this.positionX;
    }

    public int getPositionY() {
        return this.positionY;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }
}
