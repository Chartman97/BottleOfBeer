import java.util.Scanner;
// BottleOfBeer
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int userInput;
        int fingerPointRight = 0x1F449; //Finger Point Right ->
        int musicalNotes = 0x1F3B6; // Musical Notes

// Quick Hello & User Input
        System.out.println("\nHello!\nI was created to sing a song for you... pretty sad, ain't it..");
        System.out.printf("So.. Pick a number of bottles..\nThen Enter Here " + Character.toString(fingerPointRight));
        userInput = in.nextInt();
        System.out.println(" ");

// Song
        for (int i = userInput; i > 1; i--) {
            System.out.print(Character.toString(musicalNotes) + i + " Bottles of beer on the wall, ");
            System.out.print(i + " Bottles of beer. " + Character.toString(musicalNotes));
            System.out.print("\n" + (Character.toString(musicalNotes) + "Take one down and pass it around, "));
            System.out.println((i - 1) + " bottles of beer on the wall " + Character.toString(musicalNotes) + "\n");
        }
        System.out.println(Character.toString(musicalNotes) + "1 Bottle of beer on the wall, 1 Bottle of beer." + (Character.toString(musicalNotes)));
        System.out.println((Character.toString(musicalNotes) + "Take on down and pass it around, 0 Bottles of beer on the wall\n"));
        System.out.println((Character.toString(musicalNotes) + "0 Bottles of beer on the wall, 0 Bottles of beer."));
        System.out.print(Character.toString(musicalNotes) + "Go to the store and buy some more, ");
        System.out.println(userInput + " bottles of beer on the wall. " + Character.toString(musicalNotes));
    }
}
