/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xyz;

import java.util.Scanner;

/**
 *
 * @author IT Josh
 */
public class XYZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        User usr = new User();
        int ch;
        usr.setAmount(1000.0);
        double newBal = 0.0;

        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Create an Account");
        System.out.println("-----------------");
        System.out.println("Enter username");
        usr.setUsername(sc.nextLine());
        String usrnm = usr.getUsername();
        System.out.println("Enter Password");
        usr.setPassword(sc.nextLine());
        String passd = usr.getPassword();
        System.out.println("Enter Email");
        usr.setEmail(sc.nextLine());

        System.out.println("Please Login in the system");
        System.out.println("===========================");
        System.out.println("Enter username");
        usr.setUsername(sc.nextLine());
        String usr1=usr.getUsername();
        System.out.println("Enter Password");
        usr.setPassword(sc.nextLine());
        String pwd=usr.getPassword();

        if ((usrnm == null ? usr1 == null : usrnm.equals(usr1)) & (passd == null ? pwd == null : passd.equals(pwd))) {

            do {

            
                System.out.println("1. Initial Balance");
                System.out.println("2. To deposit");
                System.out.println("3. To withdraw");
                System.out.println("4. To check balance");
                System.out.println("0. To exit");
                System.out.println("Pease!" + " " + name + " " + "Enter your choice");

                ch = sc.nextInt();
//            if (ch <=3 ){
//                
//            }
                switch (ch) {
       
                    case 1:
                        System.out.println("your initial balance is: " + usr.getAmount());

                        break;
                    case 2:
                        System.out.println("Enter the amount of money to deposit");
                        double cash1 = sc.nextDouble();
                        double addAmount = usr.getAmount() + cash1;
                        usr.setAmount(addAmount);
                        System.out.println("Money deposited: " + cash1);
                        System.out.println("the current balance is: " + usr.getAmount());
//                    prev = mn.makeDeposit(cash1);
                        break;
                    case 3:

                        System.out.println("Send Money");
                        System.out.println("Enter the amount");
                        double transfer = sc.nextDouble();
                        if (usr.getAmount() < transfer) {
                            System.err.println("insufficent balance!");
                        } else if (transfer >= 1 & transfer <= 10000) {
                            newBal = usr.getAmount() - transfer;

                        } else if (transfer > 10000 & transfer <= 100000) {
                            newBal = usr.getAmount() - transfer - 200;

                        } else if (transfer > 100000) {
                            newBal = usr.getAmount() - transfer - 1000;

                        } else {
                            System.err.println("no Transaction allowed");
                        }
                        break;
                    case 4:
                        System.out.println("balance: " + newBal);
                        break;
                    case 0:
                        System.out.println("Thank you!" + " " + name);
//                    JOptionPane.showMessageDialog("Thank you", ch);
                        System.exit(0);
                    default:
                        System.err.println("Wrong Choice" + " " + name);
                        break;

                }

            } while (ch != 0);
        } else {
            System.err.println("Invalid Credentials");
        }
    }
}
