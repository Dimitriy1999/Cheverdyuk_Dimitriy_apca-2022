//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner {
    public static void main(String[] args) {
        print();

    }
    public static void print() {
        Scanner keyboard = new Scanner( in );
        out.print("Enter a number to see if it's even :: ");
        int inputNumber = keyboard.nextInt();
        if (NumberVerify.isEven(inputNumber) == true) {
            out.print("The number you picked is even");
        } else {
            out.print("The number you picked is odd");
        }
    }
}
