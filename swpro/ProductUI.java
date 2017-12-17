/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swpro;

import java.util.Scanner;

/**
 *
 * @author Andalus
 */
public class ProductUI {

    ProductCTL mProductCTL;

    public void suggestProduct() {
        String temp="";
        String choice;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("enter your suggestion product: ");
            temp = s.nextLine();
            mProductCTL.suggestProduct(temp);
//            Suggestion.add(temp);
            System.out.println("Do you want to suggest another product:(y/n) ");
            choice = s.nextLine();
        } while (choice == "Y" || choice == "y");
    }

    public void buyProduct() {
        System.out.println("Enter the product you search for: ");
        Scanner s = new Scanner(System.in);
        String name;
        name = s.nextLine();
        mProductCTL.buyProduct(name);
    }

    public void explore() {
        System.out.println("Enter the product you search for: ");
        Scanner s = new Scanner(System.in);
        String name;
        name = s.nextLine();
        mProductCTL.explore(name);
    }

    public void addProduct() {
        int choice;
        String name = "";
        Scanner s = new Scanner(System.in);
        System.out.println("Suggestion notifiction: ");
        for (int i = 0; i < mProductCTL.Suggestion.size(); i++) {
            System.out.println((i + 1) + mProductCTL.Suggestion.get(i));
        }
        System.out.println("Choose one to add it: ");
        choice = s.nextInt();
        s.nextLine();
        name = mProductCTL.Suggestion.get(choice - 1);
        System.out.println("Choose one action:\n1- accept suggestion\n2- reject suggestion");
        choice = s.nextInt();
        s.nextLine();
        String choose = "";
        switch (choice) {
            case 1:
                choose = "accept";
                mProductCTL.addProduct(choose, name);
                break;
            case 2:
                choose = "reject";
                mProductCTL.addProduct(choose, name);
                break;
        }
    }
    
    public void Payment() {
        System.out.println("Choose the payment way: \n1-pay on delivery.\n2-pay by visa cart.\n3-pay by voucher cart");
        int choice;
        String type = "";
        Scanner s = new Scanner(System.in);
        choice = s.nextInt();
        s.nextLine();
        switch (choice) {
            case 1:
                type = "delivery";
                mProductCTL.Payment(type);
                break;
            case 2:
                type = "visa";
                mProductCTL.Payment(type);
                break;
            case 3:
                type = "voucher";
                mProductCTL.Payment(type);
                break;
        }
    }
}
