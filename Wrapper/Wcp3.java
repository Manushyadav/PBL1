import java.util.Scanner;

public class Wcp3 {
    public static void main(String[] args) {    
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the number");
        int b = a.nextInt();
        if (b<1 || b>255) {
            System.out.println("Enter valid nubver");
        }
        else{
            String c= Integer.toBinaryString(b);
            String paddedString = String.format("%8s",c).replace(" ", "0");
            System.out.println(paddedString);
        }

    }

}