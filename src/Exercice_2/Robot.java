package Exercice_2;
import static java.lang.Math.*;
import java.util.ArrayList;

/**
 * Les robots.
 */
public class Robot extends Moveable {

    /**
     * Charge maximale et objets transportés.
     */
    protected int maxLoad;
    protected ArrayList<FieldObject> cargo = new ArrayList<>();

    /**
     * Constructeur.
     *
     * @param f  Terrain sur lequel vit l'objet.
     * @param w  Poids
     * @param x  Abscisse
     * @param y  Ordonnée
     * @param l  Charge maximale
     */
    public Robot(Field f, int w, double x, double y, int l) {
	    super(f, w, x, y);
	    if (l < 0){
	        this.maxLoad = 0;
        } else {
            this.maxLoad = l;
        }
    }
    
    /**
     * Calcul de la charge actuelle.
     *
     * @return Charge actuelle
     */
    public int cargoWeight() {
        int charge = 0;
        for ( FieldObject o : cargo) {
            charge = charge + o.getWeight();
        }
        return charge;
    }

    /**
     * Prendre un objet.
     *
     * @param o  Objet à prendre
     */
    public void lift(FieldObject o) {
        if (this.dist(o.x, o.y) == 1){
            if (this.maxLoad >= o.getWeight()) {
                o.lifted = true;
                this.cargo.add(o);
                this.maxLoad = this.cargoWeight();
            }
        }
    }

    /**
     * Déposer un objet.
     *
     * @param o  Objet à déposer
     */
    public void dropOff(FieldObject o) {
        if (o.lifted && this.cargo.contains(o)){
            o.lifted = false;
            o.unsafeSetPosition(this.field.normalizeX(this.x), this.field.normalizeY(this.y));
            this.cargo.remove(o);
            this.maxLoad = this.cargoWeight();
        }
    }

}
