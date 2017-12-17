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
public class BrandUI {
    public BrandUI() {
//        mBrandCTL = new BrandCTL();
    }
    public void manageBrand(){
        Scanner s= new Scanner(System.in);
        int choice;
        String name="";
        String type="";
        String action;
        do{
            System.out.println("Do you need update or delete a brand?\nchoose 1- to delete.\n 2- to update");
            choice=s.nextInt();
            s.nextLine();
            switch(choice){
                case 1:
                    type="delete";
                    System.out.println("Enter the name of brand to delete it.");
                    name=s.nextLine();
                    mBrandCTL.manage_brand(type, name);
                    break;
                case 2:
                    type="update";
                    System.out.println("Enter the name of brand to update it.");
                    name=s.nextLine();
                    mBrandCTL.manage_brand(type, name);
            }
            System.out.println("Do you need to manage another brand? (y/n)");
            action=s.nextLine();
        }while(action == "Y" || action=="y");
        
    }
    public void suggestBrand() {
        String temp;
        String choice;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("enter your suggestion product: ");
            temp = s.nextLine();
            mBrandCTL.suggestBrand(temp);
            System.out.println("Do you want to suggest another product:(y/n) ");
            choice = s.nextLine();
        } while (choice == "Y" || choice == "y");
    }
    public void addBrand() {
        int choice;
        String name = "";
        Scanner s = new Scanner(System.in);
        System.out.println("Suggestion notifiction: ");
        for (int i = 0; i < mBrandCTL.Suggestion.size(); i++) {
            System.out.println((i + 1) + mBrandCTL.Suggestion.get(i));
        }
        System.out.println("Choose one to add it: ");
        choice = s.nextInt();
        s.nextLine();
        name = mBrandCTL.Suggestion.get(choice - 1);
        System.out.println("Choose one action:\n1- accept suggestion\n2- reject suggestion");
        choice = s.nextInt();
        s.nextLine();
        String choose = "";
        switch (choice) {
            case 1:
                choose = "accept";
                mBrandCTL.addBrand(choose, name);
                break;
            case 2:
                choose = "reject";
                mBrandCTL.addBrand(choose, name);
                break;
        }
    }
}
