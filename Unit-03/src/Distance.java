//(c) A+ Computer Science 
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance {
    private int xOne, yOne, xTwo, yTwo;
    private double distance;

    public Distance() {
        //Don't think i need anything in here?
    }

    public Distance(int x1, int y1, int x2, int y2) {
        setCoordinates(x1, y1, x2, y2);
    }

    public void setCoordinates(int x1, int y1, int x2, int y2) {
    	//setting the variables in the class to the parameters
        xOne = x1;
        xTwo = x2;
        yOne = y1;
        yTwo = y2;
    }

    public void calcDistance() {
    	//Distance formula 
        distance = Math.sqrt((Math.pow(xTwo - xOne, 2)) + (Math.pow(yTwo - yOne, 2)));
    }

    public double getDistance() {
        //Don't need this?
        return distance;
    }

    public void print() {
        System.out.println("distance == " + String.format("%.3f", distance));
    }

    //complete print or the toString

    public String toString() {
        return "";
    }
}
