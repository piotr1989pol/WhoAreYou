public class Array1 {
public static void main(String args[]) {

    int monthDays[] = {31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30};
    System.out.println("czwarty miesiąc ma : " + monthDays[3] + "dni");

    // średnia z tablicy monthDays

    int result = 0;
    int i;
    int a;
    for (i = 0; i < 12; i++)
        result = result + monthDays[i];

    System.out.println("średnia z tablicy monthDays wynosi : " + result / 12);

    //wypisanie całej tablicy

    for (a = 0; a < 12; a++)
        System.out.println("elementy tablicy monthDays = : " + monthDays[a]);

    // liczby parzyste i nie parzyste tablicy monthDays
    int arrayB[] = {2, 4, 5, 6, 7, 8, 9};
    int b;
    for (b = 0; b < 7; b++) {
        if (arrayB[b] % 2 == 0) {
            System.out.println("liczby parzyste z tablicy arrayB : " + arrayB[b]);
        }
    }
    for (b = 0; b < 7; b++) {
        if (arrayB[b] % 2 != 0) {
            System.out.println("liczby nie parzyste z tablicy arrayB " + arrayB[b]);
        }

    }
}}