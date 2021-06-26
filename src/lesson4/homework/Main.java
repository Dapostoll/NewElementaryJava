package lesson4.homework;

import lesson4.homework.exceptions.WrongFieldException;
import lesson4.homework.utils.Helper;


import java.util.Scanner;

public class Main {
    private static Helper helper;

    public Main() {
        helper = new Helper();
    }

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
enterAccountId();

    }

    public static void enterAccountId() {

        System.out.println("Enter account client ID");
        String enteredAccountIdResult = scanner.nextLine();
        String sendsEnteresAccountIdResult = checkerSendsEnteredAccountIdResult(enteredAccountIdResult);

    }

    public static String checkerSendsEnteredAccountIdResult(String accountId) {
        while (accountId.length() != 10) {
            try {
                helper.checkerIdClint(accountId);
            } catch (WrongFieldException e) {
                e.printStackTrace();
            }
            System.out.println("Account Id length should be 10.\n" +
                    "Enter Account Id again:");
            accountId = scanner.nextLine();
        }
        return accountId;
    }

}