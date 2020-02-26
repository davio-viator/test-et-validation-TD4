package Exercice_2;

import java.util.ArrayDeque;

public class Field {

    private double height;
    private double width;
    private ArrayDeque<FieldObject> objectList;


    public Field(double height,double width){
        this.height = height;
        this.width = width;
        objectList = new ArrayDeque<FieldObject>();
    }

}
