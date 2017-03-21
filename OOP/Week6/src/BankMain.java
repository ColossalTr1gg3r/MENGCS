import java.util.ArrayList;
import java.util.Scanner;

public class BankMain {
    private static double amount;
    private static ArrayList<Account> accountList = new ArrayList<>();
    private static Account selectedAccount;
    private static boolean flag = false;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Menu starts from here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the option for the operation you need:");
        System.out.println("***************************************");
        System.out.println("Options: 1:New Account\n"
        		                    + "         2:Deposit\n"
        		                    + "         3:Withdraw\n"
        		                    + "         4:Check Balance\n"
        		                    + "         5:Select Account");
        System.out.println("***************************************");
        Account account = null;
        while (true) {
            System.out.println("> "); // indicator for user input
            String choice = input.next();
            // Options
            switch (choice) {
                case "1":
                    // Create new account
                    int accNo = 0;
                    int bal = 0;
                    System.out.println("Enter account number : ");
                    accNo = input.nextInt();
                    System.out.println("Enter initial balance: ");
                    bal = input.nextInt();
                    System.out.println("Current account: " + accNo + " "
                        + "Balance: £" + bal);
                    account = new Account(bal, accNo);
                    accountList.add(account);
                    break;
                case "2":
                    // select account
                    System.out
                        .println("Enter account number for further operations : ");
                    int selectedAcc = scan.nextInt();
                    System.out.println("Selected account : " + selectedAcc);
                    for (Object object : accountList) {
                        selectedAccount = (Account) object;
                        if (selectedAccount.getAccNumber() == selectedAcc) {
                            flag = true;
                            break;
                        } else {
                            flag = false;
                        }
                    }
                    if (!flag) {
                        System.out.println("Account doesn't exists.");
                    }
                    if (accountList.size() == 0) {
                        System.out.println("Zero account exists.");
                    }
                    break;
                case "3":
                    // Deposit amount
                    System.out.println("Enter amount to deposit :  ");
                    amount = scan.nextDouble();
                    if (amount <= 0) {
                        System.out
                            .println("You must deposit an amount greater than 0.");
                    } else {
                        if (flag) {
                            selectedAccount.deposit(amount);
                            System.out.println("You have deposited " + amount
                                + ". Total balance : "
                                + (selectedAccount.getBalance()));
                        } else {
                            System.out.println("Please select account number.");
                        }
                    }
                    break;
                case "4":
                    // Withdraw amount
                    System.out.println("Enter amount to be withdrawn: ");
                    amount = scan.nextDouble();
                    if (amount > account.getBalance() && amount <= 0) {
                        System.out.println("You can't withdraw that amount!");
                    } else if (amount <= selectedAccount.getBalance()) {
                        if (flag) {
                            selectedAccount.withdraw(amount);
                            System.out.println("You have withdraw : " + amount
                                + " NewBalance : "
                                + selectedAccount.getBalance());
                        } else {
                            System.out.println("Please select account number.");
                        }
                    }
                    break;
                case "55":
                    // check balance in selected account
                    if (flag) {
                        System.out.println("Your current account balance : "
                            + selectedAccount.getBalance());
                    } else {
                        System.out.println("Please select account number.");
                    }
                    break;
                case "exit":
                default:
                    // quit
                    System.out.println("Thank You. Visit Again!");
                    flag = false;
                    input.close();
                    scan.close();
                    System.exit(0);
                    break;
            }
        } // end of menu loop
    }// end of main
} // end of class