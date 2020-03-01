package Exercice_2;

import Exercice_2.Field;

import static java.lang.Math.*;

/**
 * Tous les objets.
 */
public class FieldObject {

    /**
     * Les objets sont caractérisés par un poids et des coordonnées.
     * Ils appartiennent à un terrain, et peuvent être portés ou non.
     */
    protected Field field;
    protected int weight;
    protected double x, y;
    protected boolean lifted;

    /**
     * Constructeur.
     *
     * @param f  Terrain sur lequel vit l'objet.
     * @param w  Poids
     * @param x  Abscisse
     * @param y  Ordonnée
     */
    public FieldObject(Field f, int w, double x, double y) {
        if (w <= 0){
            this.weight = 1;
        } else {
            this.weight = w;
        }

        if (x < 0){
            this.x = 0;
        } else {
            if (x > f.width) {
                this.x = f.width;
            } else {
                this.x = x;
            }
        }

        if (y < 0){
            this.y = 0;
        } else {
            if (y > f.heigth) {
                this.y = f.heigth;
            } else {
                this.y = y;
            }
        }

	    this.field = f;
    }

    /**
     * Renvoie le poids de l'objet.
     *
     * @return Poids
     */
    public int getWeight() {
    	return this.weight;
    }

    /**
     * Définit la position de l'objet.
     *
     * @param x  Abscisse
     * @param y  Ordonnée
     */
    public void unsafeSetPosition(double x, double y) {
        this.x = x;
        this.y = y;
    }

}
