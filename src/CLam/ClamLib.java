package CLam;

import java.util.Scanner;

public class ClamLib
{
    public static void main(String[] augs)
    {
        System.out.println("Enter your name.");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Nice to meet you " + name + ".");
        System.out.println("How old are you?");
        input = new Scanner(System.in);
        int age = input.nextInt();
        System.out.println("You are " + age + " years old.");
        input.close();
    }
}
