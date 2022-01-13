//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner( in );

        out.print("Enter the first point :: ");
        int x1 = keyboard.nextInt();

        out.print("Enter the second point :: ");
        int y1 = keyboard.nextInt();

        out.print("Enter the third point :: ");
        int x2 = keyboard.nextInt();

        out.print("Enter the fourth point :: ");
        int y2 = keyboard.nextInt();

        Distance distance = new Distance(x1, y1, x2, y2);
        distance.calcDistance();
        distance.print();
    }
}
