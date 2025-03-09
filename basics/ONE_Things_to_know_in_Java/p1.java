package basics.ONE_Things_to_know_in_Java;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {

        // Basic I/O
        System.out.println("Hello World");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = s.nextLine();
        System.out.println("Namaste, "+name);
        s.close();
    }   
}
