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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UserUI user = new UserUI();
        ProductUI product = new ProductUI();
        BrandUI brand = new BrandUI();
        StoreUI store = new StoreUI();
        String type = "";
        Scanner s = new Scanner(System.in);
        int choice;
        String repeat = "";
        String again = "";
        do {
            System.out.println("1- login.\n2- sign up. ");
            choice = s.nextInt();
            s.nextLine();
            switch (choice) {
                case 1:
                    type = user.login();
                    break;
                case 2:
                    type = user.signUp();
                    break;
            }
            do {
                if (type == "customer") {
                    System.out.println("1- explore product.\n2- buy product.\n3- pay order.\n4- suggest add product.\n5- suggest add brand.\n6- manage your account");
                    choice = s.nextInt();
                    s.nextLine();
                    switch (choice) {
                        case 1:
                            product.explore();
                            break;
                        case 2:
                            product.buyProduct();
                            break;
                        case 3:
                            product.Payment();
                            break;
                        case 4:
                            product.suggestProduct();
                        case 5:
                            // suggest add brand
                            break;
                        case 6:
                            user.manageAccount(type);
                    }
                } else if (type == "admin") {
                    System.out.println("1- add product to the system.\n2- add brand to the system.\n3- provide voucher card.\n4- manage brand.\n5- manage store data.\n6- explore product\n7- manage your account.");
                    choice = s.nextInt();
                    s.nextLine();
                    switch (choice) {
                        case 1:
                            product.addProduct();
                            break;
                        case 2:
                            brand.addBrand();
                            break;
                        case 3:
                            store.provideVoucherCard();
                            break;
                        case 4:
                            brand.manageBrand(); 
                            break;
                        case 5:
                            store.manageStore();
                            break;
                        case 6:
                            product.explore();
                            break;
                        case 7:
                            user.manageAccount(type);
                    }
                } else {
                    System.out.println("1- add store.\n2- add product to the store.\n3- suggest add product.\n4- explore product.\n5-view number of viewers to each product in the store.\n6- view the most viewed product in the store.\n7- manage your account");
                    choice = s.nextInt();
                    s.nextLine();
                    switch (choice) {
                        case 1:
                            store.addStore();
                            break;
                        case 2:
                            store.addProductToStore();
                            break;
                        case 3:
                            product.suggestProduct();
                            break;
                        case 4:
                            product.explore();
                            break;
                        case 5:
                            // # of viewers
                            break;
                        case 6:
                            // the most viewed product
                            break;
                        case 7:
                            user.manageAccount(type);
                    }
                }
                System.out.println("Do you need to do another action: (y/n)? ");
                again = s.nextLine();
            } while (again == "y" && again == "Y");
            System.out.println("Do you need to login or sign up as a different user?! (y/n)");
            repeat = s.nextLine();

        } while (repeat == "Y" && repeat == "y");

    }

}
