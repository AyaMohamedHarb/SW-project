/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swpro;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Andalus
 */
public class ProductCTL {

    ProductUI mProductUI;
   // Product mProduct;
    Customer mCustomer;
    Admin mAdmin;
    ArrayList<String> Suggestion;
    ArrayList<Product> arrProduct;
    ArrayList<Product> arrCart;

    public ProductCTL() {
        //mProductUI = new ProductUI();
        //mProduct = new Product();
        mCustomer = new Customer();
//        mAdmin = new Admin();
        Suggestion = new ArrayList<String>();
        arrCart = new ArrayList<Product>();
        arrProduct = new ArrayList<Product>();
    }

    public Product explore(String n) {
        Product temp = new Product();
        for (int i = 0; i < arrProduct.size(); i++) {
            temp = arrProduct.get(i);
            if ((temp.name) == n) {
                temp.get_product(n);
                temp.exploreCounter++;
            } else {
                System.out.println("oops, Product not found!");     //LOL :D
            }
        }
        return temp;

    }

    public void buyProduct(String n) {
        Product temp = new Product();
        temp = explore(n);
        temp.put_in_cart(temp);
        temp.userBuyCounter++;
    }

    public void addProduct(String s, String name) {
        switch (s) {
            case "accept":
                accept(name);
                break;
            case "reject":
                reject(name);
                break;
        }
    }
    public void reject(String n) {
        for (int i = 0; i < Suggestion.size(); i++) {
            if (Suggestion.get(i) == n) {
                Suggestion.remove(i);
            }
        }
    }

    public void accept(String n) {
        Product mProduct= new Product();
        System.out.println("Enter information of " + n);
        mProduct.set_product();
        arrProduct.add(mProduct);
    }
    

    public void suggestProduct(String temp) {
        Suggestion.add(temp);
    }

    public void Payment(String n) {
        double total = 0;
        int choice;
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < arrCart.size(); i++) {
            Product temp = new Product();
            temp = arrCart.get(i);
            temp.productCounter++;
            total += temp.price;
        }
        System.out.println("Your order information are: ");
        for (int i = 0; i < arrCart.size(); i++) {
            Product temp = new Product();
            temp = arrCart.get(i);
            System.out.println(temp.name + " its price: " + temp.price);
        }
        System.out.println("Total price is: " + total);
        System.out.println("choose 1- to edit the order or 2- to confirm the payment process: ");
        choice = s.nextInt();
        switch (choice) {
            case 1:
                String choose = "";
                do {
                    edit();
                    System.out.println("do you need to edit it again(y/n) : ");
                    choose = s.nextLine();
                } while (choose == "Y" || choose == "y");
            case 2:
                confirm();
                if (n == "visa") {
                    System.out.println("Enter your visa card: ");
                    mCustomer.bankAccount = s.nextLine();
                } else if (n == "voucher") {
                    System.out.println("Enter your voucher card ID: ");
                    mCustomer.mVoucher.ID= s.nextInt(); s.nextLine();
                }
                break;
        }

    }

    public void confirm() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your firstname: ");
        mCustomer.firstName = s.nextLine();
        System.out.println("Enter your last name: ");
        mCustomer.lastName = s.nextLine();
        System.out.println("Enter your address: ");
        mCustomer.address = s.nextLine();
        System.out.println("Enter your mobile number: ");
        mCustomer.mobile = s.nextLine();

    }

    public void edit() {
        Scanner s = new Scanner(System.in);
        int choice;
        System.out.println("choose which one of your order to delete: ");
        for (int i = 0; i < arrCart.size(); i++) {
            Product temp = new Product();
            temp = arrCart.get(i);
            System.out.println((i + 1) + "-" + temp.name + " its price: " + temp.price);
        }
        choice = s.nextInt();
        arrCart.remove(choice - 1);

    }

}
