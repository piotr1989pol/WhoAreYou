import javax.swing.*;
import java.util.Scanner;

/**
 * Created by Piotr on 2017-07-10.
 */
public class WhoAreYou {
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String a;

    System.out.println("wpisz swoje imię : ");

a = sc.next();
System.out.print("twoje imię to : " + a);
    System.out.println();
    String b;
    if(a.endsWith("a"))
        System.out.println("jesteś kobietą :)");
        else {
        System.out.println("jesteś mężczyzną :)");
        }

    }


}




