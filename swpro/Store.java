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
public class Store {

    String name;
    ArrayList<Product> arrProduct;
    ArrayList<voucherCard> arrVoucher;
    StoreCTL mStoreCTL;
    public Store() {
        name = "";
        arrVoucher = new ArrayList<voucherCard>();
//        arrStore = new ArrayList<Store>();
    }

    public void set_store() {
        Scanner s = new Scanner(System.in);
        System.out.println("enter store name: ");
        this.name = s.nextLine();
        String choice;
        do {
            Product pro = new Product();
            pro.set_product();
            this.arrProduct.add(pro);
            System.out.println("Do you need to insert another product:(Y/N) ");
            choice = s.nextLine();
            mStoreCTL.arrStore.add(this);
        } while (choice == "y" || choice == "Y");
    }

    public void get_store(String n) {
        Store temp = new Store();
        for (int i = 0; i < mStoreCTL.arrStore.size(); i++) {
            temp = mStoreCTL.arrStore.get(i);
            if (temp.name == n) {
                System.out.println("Store name: " + temp.name);
                System.out.println("Store products: ");
                for (int j = 0; j < temp.arrProduct.size(); j++) {
                    //System.out.println(temp.arrProduct.get(i));
                    Product pro =new Product();
                    pro= temp.arrProduct.get(i);
                    pro.get_product(pro.name);

                }
            }

        }
    }

    public void delete_store(String n) {
        Store temp = new Store();
        for (int i = 0; i < mStoreCTL.arrStore.size(); i++) {
            temp = mStoreCTL.arrStore.get(i);
            if (temp.name == n) {
                mStoreCTL.arrStore.remove(temp);
            }
        }
    }

    public Store update_store(String n) {
        Store temp = new Store();
        for (int i = 0; i < mStoreCTL.arrStore.size(); i++) {
            temp = mStoreCTL.arrStore.get(i);
            if (temp.name == n) {
                return temp;
            }
        }
        return temp;
    }

    public void provideVoucherCard(voucherCard mVoucher) {
        arrVoucher.add(mVoucher);
    }
}

class normalStore extends Store {

    String address;

    public void set_normalStore() {
        
        Scanner s = new Scanner(System.in);
        System.out.println("enter store name: ");
        this.name = s.nextLine();
        System.out.println("Enter store address: ");
        this.address = s.nextLine();
        String choice;
        do {
            Product pro = new Product();
            pro.set_product();
            this.arrProduct.add(pro);
            System.out.println("Do you need insert another product:(Y/N) ");
            choice = s.nextLine();
            mStoreCTL.arrNStore.add(this);
        } while (choice == "y" || choice == "Y");   
    }
    public void get_store(String n) {
        normalStore temp = new normalStore();
        for (int i = 0; i < mStoreCTL.arrNStore.size(); i++) {
            temp = mStoreCTL.arrNStore.get(i);
            if (temp.name == n) {
                System.out.println("Store name: " + temp.name);
                System.out.println("Store address: "+ temp.address);
                System.out.println("Store products: ");
                for (int j = 0; j < temp.arrProduct.size(); j++) {
                    Product pro =new Product();
                    pro= temp.arrProduct.get(i);
                    pro.get_product(pro.name);
                }
            }
        }
    }

    @Override
    public void delete_store(String n) {
        normalStore temp = new normalStore();
        for (int i = 0; i < mStoreCTL.arrNStore.size(); i++) {
            temp = mStoreCTL.arrNStore.get(i);
            if (temp.name == n) {
                mStoreCTL.arrNStore.remove(temp);
            }
        }
    }

    @Override
    public Store update_store(String n) {
        normalStore temp = new normalStore();
        for (int i = 0; i < mStoreCTL.arrNStore.size(); i++) {
            temp = mStoreCTL.arrNStore.get(i);
            if (temp.name == n) {
                return temp;
            }
        }
        return temp;
    }
    
}

class onLineStore extends Store {

}
