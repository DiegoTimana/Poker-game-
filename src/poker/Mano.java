/*
 * @Author Gabriel Arango
 * @Author Diego Timaná
 * @Version 1.0
 */
package poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Clase encargada de emular una mano de cartas que un jugador puede usar, su
 * principal estructura es un <code> ArrayList </code> que contiene las cartas a
 * usar.
 */
public class Mano extends Baraja {
    /** The mano. */
    // la mano es una baraja
    private ArrayList<Carta> mano;

    /**
     * Instantiates a new mano.
     */
    public Mano() {
        mano = new ArrayList<Carta>();
    }

    /**
     * Obtiene el número de objetos de carta alojados en el ArrayList mano.
     *
     * @return int con tamaño en elementos de la mano
     */
    public int manoSize() {
        return mano.size();
    }

    /**
     * Obtiene una carta en una posición específica del arraylist.
     *
     * @param pos the pos
     * @return the carta
     */
    public Carta getCarta(int pos) {
        Carta cartaDeMano = mano.get(pos);
        return cartaDeMano;
    }

    /**
     * Añade una nueva carta al final de su Arraylist de mano.
     *
     * @param carta the carta
     */
    public void addCarta(Carta carta) {
        mano.add(carta);
    }

    /**
     * Este método limpia todos los elementos del ArrayList mano.
     */
    public void limpiarMano() {
        mano.clear();
    }

}