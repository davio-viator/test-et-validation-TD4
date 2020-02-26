package Exercice_2;

public class Moveable extends FieldObject {

    private double carburant;

    public Moveable(double weight, double x, double y, double carburant) {
        super(weight, x, y);
        this.carburant = carburant;
    }


}
