package Exercice_2;
import static java.lang.Math.*;

/**
 * Les objets mobiles.
 */
public class Moveable extends FieldObject {

    /**
     * Niveau de carburant.
     */
    protected double fuel;

    /**
     * Constructeur.
     *
     * @param f  Terrain sur lequel vit l'objet.
     * @param w  Poids
     * @param x  Abscisse
     * @param y  Ordonnée
     */
    public Moveable(Field f, int w, double x, double y) {
	    super(f, w, x, y);
        this.fuel = 10;
    }

    /**
     * Calcul de la distance à un point de coordonnées données.
     *
     * @param x  Abscisse
     * @param y  Ordonnée
     * @return Distance
     */
    protected double dist(double x, double y) {
	    return (Math.abs(this.x - this.field.normalizeX(x)) + Math.abs(this.y - this.field.normalizeY(y)));
    }

    /**
     * Se déplacer vers un point de coordonnées données.
     *
     * @param x  Abscisse cible
     * @param y  Ordonnée cible
     */
    public void goTo(double x, double y) {
        for (int i = 0; i < dist(x,y); i++){

            if(this.fuel > 0){
                this.fuel = this.fuel - 1;

                if (this.field.normalizeX(x) > this.x){
                    this.x = this.x + 1;
                } else {
                    this.x = this.x - 1;
                }

                if (this.field.normalizeY(y) > this.y){
                    this.y = this.y + 1;
                } else {
                    this.y = this.y - 1;
                }
            }
        }
    }

}
