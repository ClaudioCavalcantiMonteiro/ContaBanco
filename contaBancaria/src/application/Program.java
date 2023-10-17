package application;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {
    public static void clearScreen()throws IOException, InterruptedException{
    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
}
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        clearScreen();
        Account account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there an Initial deposit (y/n)? ");
        char response = sc.next().charAt(0);
        if(response == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        }
        else{
            account = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit Value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a whithdraw Value: ");
        double saqueValue = sc.nextDouble();
        account.whithdraw(saqueValue);
        System.out.println("Updated account data: ");
        System.out.println(account);

        sc.close();
    }
}
