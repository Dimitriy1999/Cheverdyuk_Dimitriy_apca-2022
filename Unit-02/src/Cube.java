//(c) A+ Computer Science
// www.apluscompsci.com
//Name Dimitriy Cheverdyuk
//Date 1/12/2022

public class Cube {
    public static double area(int side) {
        int endResult = 1;
        int powAmount = 2;
        for (int i = 1; i <= powAmount; i++) {
            endResult = endResult * side;
        }
        return endResult * 6;
    }
}
