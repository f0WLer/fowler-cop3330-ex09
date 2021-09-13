import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alex Fowler
 */
public class App 
{
    public static void main( String[] args )
    {
        final int f2_per_gallon = 350;
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the length? ");
        int length = scanner.nextInt();
        System.out.print("What is the width? ");
        int width = scanner.nextInt();
        double area = length * width;
        double n_gallons = Math.ceil(area / f2_per_gallon);
        System.out.println(String.format("You will need to purchase %.0f gallons of paint to cover %.0f square feet.",
                n_gallons, area));
    }
}
