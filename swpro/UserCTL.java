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
public class UserCTL {

    //UserUI mUserUI= new UserUI();
    
    ArrayList<User> arrUser= new ArrayList<User>();
    ArrayList<Customer> arrCustomer= new ArrayList<Customer>();


    public String LogIn(int choice) {
        Scanner s = new Scanner(System.in);
        String type = "";
        User mUser= new User();
    Customer mCustomer =new Customer();
        switch (choice) {
            case 1:
                System.out.println("Enter Email: ");
                mUser.email = s.nextLine();
                System.out.println("Enter password: ");
                mUser.password = s.nextLine();
                type = "customer";
                break;
            case 2:
                System.out.println("Enter Email: ");
                mUser.email = s.nextLine();
                System.out.println("Enter password: ");
                mUser.password = s.nextLine();
                type = "admin";
                break;
            case 3:
                System.out.println("Enter Email: ");
                mUser.email = s.nextLine();
                System.out.println("Enter password: ");
                mUser.password = s.nextLine();
                type = "store owner";
                break;
        }
        return type;
    }

    public String SignUp(int choice) {
        User mUser= new User();
    Customer mCustomer =new Customer();
        String type = "";
        switch (choice) {
            case 1:
                mCustomer.set_user();
                type = "customer";
                break;
            case 2:
                mUser.set_user();
                type = "admin";
                break;
            case 3:
                mUser.set_user();
                type = "store owner";
                break;
        }
       return type; 
    }
    public void manageAccount(String type, String action,String mail){
        User mUser= new User();
    Customer mCustomer =new Customer();
        switch(type){
            case "store owner":
            case "admin":
                switch(action){
                    case "update":
                        mUser.update_user(mail);
                        break;
                    case "delete":
                        mUser.delete_user(mail);
                        break;
                }
                break;
            case "customer":
               switch(action){
                    case "update":
                        mCustomer.update_user(mail);
                        break;
                    case "delete":
                        mCustomer.delete_user(mail);
                        break;
                } 
        }
    }
}
