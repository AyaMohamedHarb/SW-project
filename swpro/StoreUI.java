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
public class StoreUI {
    StoreCTL mStoreCTL;
    
    public void addStore(){
        Scanner s=new Scanner(System.in);
        String type;
        System.out.println("Which type of store you want to add:(normal/online) ");
        type=s.nextLine();
        System.out.println("Enter Store information: ");
        mStoreCTL.addStore(type);
    }
    public void addProductToStore(){
        Scanner s=new Scanner(System.in);
        String name;
        String type;
        System.out.println("Which store you want to add the product?(normal/online) ");
        type=s.nextLine();
        System.out.println("Enter Store name: ");
        name=s.nextLine();
        mStoreCTL.addProductToStore(type,name);
    }
    public void manageStore(){
        System.out.println("Do you need to 1- delete store\n     2- update store.");
        Scanner s= new Scanner(System.in);
        int choice;
        String action="";
        choice=s.nextInt();
        s.nextLine();
        System.out.println("Which type of store you want to manage?(normal/online)");
        String type="";
        type=s.nextLine();
        System.out.println("Enter store name: ");
        String name="";
        name=s.nextLine();
        switch(choice){
            case 1:
                action="delete";
                type="normal";
                mStoreCTL.manageStore(action,type, name);
                break;
            case 2:
                action="update";
                type= "online";
                mStoreCTL.manageStore(action,type, name);
                break;
        }
    }
    public void provideVoucherCard() {
        mStoreCTL.provideVoucherCard();
    }
        
}
