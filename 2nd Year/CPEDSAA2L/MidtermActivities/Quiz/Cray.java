package Quiz;
//Fabian, Charles Bryan R. - CPE - 211
import java.util.Scanner;
public class Cray {
    public static void main(String[] args) {
        String mousepad[] = {"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
        Scanner pol = new Scanner(System.in);
        System.out.print("\nEnter two Months by Number (1-12). \n1: ");
        int mon = pol.nextInt();
        System.out.print("2: ");
        int mona = pol.nextInt();
        System.out.println("\nTwo months:"+"\n"+mousepad[mon-1]+"\n"+mousepad[mona-1]);
        System.out.println("\nAll months: ");
        for (int u = 0; u < mousepad.length; u++){
            System.out.println(u+"       "+mousepad[u]);
        }
    }
}
