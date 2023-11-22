package com.game;

import java.util.ArrayList;

/**
 * Define the Laberinto class
 */
public class Laberinto {
    // Define attributes
    private int alto;
    private int ancho;
    private ArrayList camino = new ArrayList();
    private ArrayList muros = new ArrayList();

    // Define constructor
    public Laberinto(int alto, int ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    // Define getters and setters
    public int getAlto() {
        return this.alto;
    }

    public int getAncho() {
        return this.ancho;
    }

    public ArrayList getCamino() {
        return this.camino;
    }

    public ArrayList getMuros() {
        return this.muros;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void setCamino(ArrayList camino) {
        this.camino = camino;
    }

    public void setMuros(ArrayList muros) {
        this.muros = muros;
    }

    // Define methods
    public void generarLaberinto() {
        // Define attributes
        this.camino.add(new int[] { this.ancho, this.alto });

        /* En construccion */
    }
}
