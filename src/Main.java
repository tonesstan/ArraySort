import local.DynamicArray;

import java.util.InputMismatchException;
import java.util.Scanner;

import static local.DynamicArray.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();
        String yOrN;
        boolean validInput;

        do {
            do {
                validInput = true;
                try {
                    System.out.print("Enter an integer: ");
                    dynamicArray.add(sc.nextInt());
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Try again.");
                    sc.nextLine();
                    validInput = false;
                }
            } while (!validInput);
            do {
                System.out.println("Do you want to add more integer? (y/n): ");
                yOrN = sc.next();
            } while (!yOrN.equals("y") && !yOrN.equals("n"));
        } while (yOrN.equals("y"));

        System.out.println("Your array has been sorted!");
        print(sort(dynamicArray));

        sc.close();
    }

}