package Quiz;
//Fabian, Charles Bryan R. - CPE - 211
import java.util.Scanner;
public class Dray {
    public static void main(String[] args) {
        String mousepad[] = {"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
        Scanner pol = new Scanner(System.in);
        System.out.print("\nEnter Month Number (1-12): ");
        int mon = pol.nextInt();
        if (mon < 1 || mon > 12) {
            System.out.println("ERROR: Invalid Input...");
        } else {
            System.out.println("Number "+mon+" is the Month of "+mousepad[mon-1]);
        }
    }
}
