package Exercice_2;

import static java.lang.Math.*;

/**
 * Classe pour le terrain où évolueront les objets.
 */

public class Field {

    /**
     * Hauteur et largeur du terrain.
     */
    protected int heigth, width;

    /**
     * Construction d'un terrain de dimensions données.
     *
     * @param h  Hauteur du terrain
     * @param w  Largeur du terrain
     */
    public Field(int h, int w) {
        if (h <= 0){
            this.heigth = 1;
        } else {
            this.heigth = h;
        }

        if (w <= 0) {
            this.width = 1;
        } else {
            this.width = w;
        }

    }

    /**
     * Normalisation d'une abscisse.
     *
     * @param x  Abscisse quelconque
     * @return Abscisse normalisée
     */
    public double normalizeX(double x) {
	    if (0 <= x && x <= 10){
	        return x;
        } else {
	        if (x < 0){
	            return 0;
            }  else {
	            return 10;
            }
        }
    }

    /**
     * Normalisation d'une ordonnée.
     *
     * @param //x  Ordonnée quelconque
     * @return Ordonnée normalisée
     */
    public double normalizeY(double y) {
        if (0 <= y && y <= 8){
            return y;
        } else {
            if (y < 0){
                return 0;
            }  else {
                return 8;
            }
        }
    }

}
