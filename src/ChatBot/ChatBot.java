package ChatBot;
import java.util.Scanner;

public class ChatBot {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Hello! My name is Java_bot.");
        System.out.println("I was created in 2022.");
        System.out.println("Please, remind me your name.");
        String name = in.nextLine();
        System.out.printf("What a great name you have, %s!", name);
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int age1 = in.nextInt();
        int age2 = in.nextInt();
        int age3 = in.nextInt();
        int age = (age1 * 70 + age2 * 21 + age3 * 15) % 105;
        System.out.println("Your age " + age + " that's a good time to start programming!");
    }
}
