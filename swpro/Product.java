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
public class Product {

    String name;
    double price;
    String category;
    String type;           //normal or online product
    int exploreCounter;
    int userBuyCounter;
    int productCounter;
    ProductCTL mProductCTL;

    public Product() {
        name = "";
        price = 0.0;
        category = "";
        type = "";
        exploreCounter=0;
        userBuyCounter=0;
        productCounter=0;
        //mProductCTL = new ProductCTL();
    }

    public void set_product() {
        Scanner s = new Scanner(System.in);
        System.out.println("enter product name: ");
        this.name = s.nextLine();
        System.out.println("enter product price: ");
        this.price = s.nextDouble();
        s.nextLine();
        System.out.println("enter product category: ");
        this.category = s.nextLine();
        System.out.println("enter product type:(normal/online) ");
        this.type = s.nextLine();
        mProductCTL.arrProduct.add(this);
    }

    public void get_product(String n) {
        Product temp = new Product();
        for (int i = 0; i < mProductCTL.arrProduct.size(); i++) {
            temp = mProductCTL.arrProduct.get(i);
            if (temp.name == n) {
                System.out.println("product name: " + temp.name);
                System.out.println("product price: " + temp.price);
                System.out.println("product category: " + temp.category);
                System.out.println("product type: " + temp.type);
            }
        }
    }

    public void put_in_cart(Product p) {
        mProductCTL.arrCart.add(p);
    }

    public ArrayList get_cart() {
        return mProductCTL.arrCart;
    }

    public void delete_product(String n) {
        Product temp = new Product();
        for (int i = 0; i < mProductCTL.arrProduct.size(); i++) {
            temp = mProductCTL.arrProduct.get(i);
            if (temp.name == n) {
                mProductCTL.arrProduct.remove(temp);
            }
        }
    }

    public void update_product(String n) {
        Product temp = new Product();
        for (int i = 0; i < mProductCTL.arrProduct.size(); i++) {
            temp = mProductCTL.arrProduct.get(i);
            if (temp.name == n) {
                temp.set_product();
            }
        }
        
    }
}
