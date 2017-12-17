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
public class UserUI {

    UserCTL mUserCTL= new UserCTL();
    //User mUser = new User();
    

    public String login() {
        Scanner s = new Scanner(System.in);
        int choice;
        System.out.println("1- login as customer.\n2- login as admin.\n3- login as store owner.");
        choice = s.nextInt();
        s.nextLine();
        String type = "";
        type=mUserCTL.LogIn(choice);
        return type;
    }

    public String signUp() {
        Scanner s = new Scanner(System.in);
        int choice;
        System.out.println("1- sign up as customer.\n2- sign up as admin.\n3- sign up as store owner.");
        choice = s.nextInt();
        String type = "";
        type=mUserCTL.SignUp(choice);
        return type;
    }
    public void manageAccount(String type){
        System.out.println("Do you need to 1- update\n            2- delete your account");
        Scanner s= new Scanner(System.in);
        int choice;
        choice=s.nextInt();
        String action;
        String mail="";
        System.out.println("Please enter your email: ");
        mail=s.nextLine();
        switch(choice){
            case 1:
                action="update";
                mUserCTL.manageAccount(type,action,mail);
                break;
            case 2:
                action="delete";
                mUserCTL.manageAccount(type,action,mail);
                break;
        }
        
    }
}
