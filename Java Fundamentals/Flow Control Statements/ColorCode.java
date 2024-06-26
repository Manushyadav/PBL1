/*Write a program to receive a color code from the user (an Alphabhet).
The program should then print the color name, based on the color code given.
The following are the color codes and their corresponding color names. R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White.
If color code provided by the user is not valid then print "Invalid Code".*/


import java.util.Scanner;

public class ColorCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a char = ");
        char aStr = scan.next().charAt(0);

        // Checking if the character is lowercase first
        if (Character.isLowerCase(aStr)) {
            System.out.println("Give an uppercase character");
        } else {
            // Switch statement to handle the color codes
            switch (aStr) {
                case 'R':
                    System.out.println("Red");
                    break;
                case 'B':
                    System.out.println("Blue");
                    break;
                case 'G':
                    System.out.println("Green");
                    break;
                case 'O':
                    System.out.println("Orange");
                    break;
                case 'Y':
                    System.out.println("Yellow");
                    break;
                case 'W':
                    System.out.println("White");
                    break;
                default:
                    System.out.println("Invalid Color Code");
                    break;
            }
        }

        scan.close();
    }
}
