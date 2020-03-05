package org.example;

import org.example.model.BankAccount;
import java.util.Scanner;

/*
    ToDo:
    1: refactor the code to take consideration to the Locale of the host system.
        1.1: language used by app (at least 3).
        1.2: use correct currency.
    2: add some sanity checks in methods where we change values
    3: implement missing methods
    4: Exception handling
    5: currency conversion.
 */

public class App
{
    public static Scanner scanner = new Scanner(System.in);

    public static BankAccount account = new BankAccount();

    public static void main(String[] args) {

        boolean keepLooping = true;

        do
        {
            int selection = 0;
            System.out.print(menu());
            String input = askUserFor("Select").trim();

            switch (input)
            {
                case "1":
                    System.out.print(accInfo());
                    pressEnterKeyTo();
                    break;
                case "2":
                    //Todo deposit amount to account
                    break;
                case "3":
                    //Todo withdraw amount from account
                    break;
                case "9":
                    keepLooping = false;
                    pressEnterKeyTo("close the program");
                    break;
                default:
                    System.out.println("Not a valid selection.");
                    break;
            }

        }
        while (keepLooping);


        scanner.close();
    }

    public static String accInfo()
    {
        StringBuilder infoBuilder = new StringBuilder();

        infoBuilder.append("Account Info").append("\n\n");
        infoBuilder.append("Id: ").append(account.getId()).append("\n");
        infoBuilder.append("Balance: ").append(account.getBalance()).append("\n\n");

        return infoBuilder.toString();
    }

    public static String menu()
    {
        StringBuilder menuStringB = new StringBuilder();

        menuStringB.append("Welcome to this Bank Account options menu").append("\n\n");
        menuStringB.append("1: ").append("Account Info").append("\n");
        menuStringB.append("2: ").append("Deposit money").append("\n");
        menuStringB.append("3: ").append("Withdraw money").append("\n");
        menuStringB.append("9: ").append("Exit").append("\n\n");

        return menuStringB.toString();
    }

    /**
     * Will end the sentence with "continue"
     */
    public static void pressEnterKeyTo()
    {
        System.out.println("Press Enter key to continue.");
        scanner.nextLine();
    }

    /**
     * @param endSentence = input how you want to en the sentence "press Enter key to"
     */
    public static void pressEnterKeyTo(String endSentence)
    {
        System.out.println("Press Enter key to " + endSentence + ".");
        scanner.nextLine();
    }

    public static String askUserFor(String inputName)
    {
        System.out.print(inputName + ": ");
        return scanner.nextLine();
    }
}
