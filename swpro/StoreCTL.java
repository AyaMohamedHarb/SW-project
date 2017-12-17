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
public class StoreCTL {
    Admin mAdmin;
    StoreOwner mStoreOwner;
    ArrayList<Store> arrStore;
    ArrayList<normalStore> arrNStore;

    public void addStore(String n) {
        Scanner s = new Scanner(System.in);
        String choice = "";
        if (n == "online") {
           Store mOStore = new Store();
            System.out.println("enter store name: ");
            mOStore.name = s.nextLine();
            System.out.println("Do you want to add your product now?! (y/n)");
            choice = s.nextLine();
            switch (choice) {
                case "y":
                case "Y":
                   Product mProduct = new Product();
                    mProduct.set_product();
                    mOStore.arrProduct.add(mProduct);
                    break;
                case "n":
                case "N":
                    break;
            }
            arrStore.add(mOStore);
        } else if ("normal".equals(n)) {
           normalStore mNStore = new normalStore();
            System.out.println("enter store name: ");
            mNStore.name = s.nextLine();
            System.out.println("Enter store address: ");
            mNStore.address = s.nextLine();
            System.out.println("Do you want to add your product now?! (y/n)");
            choice = s.nextLine();
            switch (choice) {
                case "y":
                case "Y":
                   Product mProduct = new Product();
                    mProduct.set_product();
                    mNStore.arrProduct.add(mProduct);
                    break;
                case "n":
                case "N":
                    break;
            }
            arrNStore.add(mNStore);
        }
    }

    public void addProductToStore(String t, String s) {
        switch (t) {
            case "normal":
                normalStore mNStore = new normalStore();
                for(int i=0; i<arrNStore.size();i++){
                    mNStore=arrNStore.get(i);
                    if(mNStore.name == s){
                        Product temp= new Product();
                        temp.set_product();
                        mNStore.arrProduct.add(temp);
                    }
                }
                break;
            case "online":
                Store mOStore = new Store();
                for(int i=0; i<arrStore.size();i++){
                    mOStore=arrStore.get(i);
                    if(mOStore.name == s){
                        Product temp= new Product();
                        temp.set_product();
                        mOStore.arrProduct.add(temp);
                    }
                }
                break;
        }
    }
    public void provideVoucherCard() {
        voucherCard mVoucher=new voucherCard();
        mVoucher.set_voucher();
        Store mStore= new Store();
        mStore.provideVoucherCard(mVoucher);
    }
    public void manageStore(String action,String type, String name){
        switch(type){
            case "normal":
                normalStore mNStore=new normalStore();
                switch(action){
                    case "update":
                        mNStore.update_store(name);
                        break;
                    case "delete":
                        mNStore.delete_store(name);
                        break;
                }
            case "online":
                onLineStore mOLineStore = new onLineStore();
                switch(action){
                    case "update":
                        mOLineStore.update_store(name);
                        break;
                    case "delete":
                        mOLineStore.delete_store(name);
                        break;
                }
        }
    }
}
