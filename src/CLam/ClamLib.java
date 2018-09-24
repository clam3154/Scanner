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
        input.close();
    }
}
