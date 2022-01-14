import static java.lang.System.*;
import java.util.Scanner;
public class Discount {
    public static double getDiscountedBill(double bill) {
        double finalValue = bill;
        double discountAmount = 15;
        if (bill > 2000) {
        	//Simple percentage stuff
            discountAmount = discountAmount / 100;
            discountAmount = bill * discountAmount;
            finalValue = bill - discountAmount;
        }
        return finalValue;
    }
}
