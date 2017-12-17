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
public class User {

    String email;
    String password;
    String userName;
    String firstName;
    String lastName;
    String gender;
    String mobile;
    
    UserCTL mUserCTL;

    public User() {
        email = " ";
        password = " ";
        userName = " ";
        firstName = " ";
        lastName = " ";
        gender = " ";
        mobile = " ";
        
        //uCTL = new UserCTL();
    }

    public void set_user() {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        this.firstName = s.nextLine();
        System.out.print("Enter Last Name: ");
        this.lastName = s.nextLine();
        System.out.print("Enter your email: ");
        this.email = s.nextLine();
        System.out.print("Enter your password: ");
        this.password = s.nextLine();
        System.out.print("Enter your mobile: ");
        this.mobile = s.nextLine();
        System.out.print("Enter your gender: ");
        this.gender = s.nextLine();
        mUserCTL.arrUser.add(this);
    }

    public void get_user(String e) {
        User user = new User();
        for (int i = 0; i < mUserCTL.arrUser.size(); i++) {
            user = mUserCTL.arrUser.get(i);
            if (user.email == e) {
                System.out.println("name: "+ user.firstName+" "+user.lastName);
                System.out.println("your email: "+user.email);
                System.out.println("your mobile: "+user.mobile);
                System.out.println("your user name: "+user.userName);
                System.out.println("your gender: "+user.gender);
               // return user;
            }
        }
        //return user;
    }

    public void delete_user(String e) {
        for (int i = 0; i < mUserCTL.arrUser.size(); i++) {
            User temp = new User();
            temp = mUserCTL.arrUser.get(i);
            if (temp.email == e) {
                mUserCTL.arrUser.remove(temp);
            }
        }
    }

    public void update_user(String e) {
        User user = new User();
        for (int i = 0; i < mUserCTL.arrUser.size(); i++) {
            user = mUserCTL.arrUser.get(i);
            if (user.email == e) {
                user.set_user();
            }
        }
        
    }

}

class Customer extends User {

    String address;
    String bankAccount;
    voucherCard mVoucher;
    //ProductCTL mProduct;
    

    public Customer() {
        address = "";
        bankAccount = "";
        //couponCode = "";
        
        //mProduct = new ProductCTL();
    }

    public void set_customer() {
//        Customer user=new Customer();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        this.firstName = s.nextLine();
        System.out.print("Enter Last Name: ");
        this.lastName = s.nextLine();
        System.out.print("Enter your email: ");
        this.email = s.nextLine();
        System.out.print("Enter your password: ");
        this.password = s.nextLine();
        System.out.print("Enter your mobile: ");
        this.mobile = s.nextLine();
        System.out.print("Enter your gender: ");
        this.gender = s.nextLine();
        System.out.println("Enter your address: " + address);
        this.address = s.nextLine();
        mUserCTL.arrCustomer.add(this);
    }

    public void get_customer(String e) {
        Customer user = new Customer();
        for (int i = 0; i < mUserCTL.arrCustomer.size(); i++) {
            user = mUserCTL.arrCustomer.get(i);
            if (user.email == e) {
                System.out.println("name: "+ user.firstName+" "+user.lastName);
                System.out.println("your email: "+user.email);
                System.out.println("your mobile: "+user.mobile);
                System.out.println("your user name: "+user.userName);
                System.out.println("your gender: "+user.gender);
                System.out.println("your address: "+user.address);
                //return user;
            }
        }
        //return user;
//       
    }

    public void delete_customer(String email) {
        for (int i = 0; i < mUserCTL.arrCustomer.size(); i++) {
            Customer temp = new Customer();
            temp = mUserCTL.arrCustomer.get(i);
            if (temp.email == email) {
                mUserCTL.arrUser.remove(temp);
            }
        }
    }

    public void update_customer(String e) {
        Customer user = new Customer();
        for (int i = 0; i < mUserCTL.arrCustomer.size(); i++) {
            user = mUserCTL.arrCustomer.get(i);
            if (user.email == e) {
                 user.set_customer();
            }
        }
    }
}

class StoreOwner extends User {

    StoreCTL mStoreCTL;
    BrandCTL mBrandCTL;

    public StoreOwner() {
        mBrandCTL = new BrandCTL();
        mStoreCTL = new StoreCTL();

    }

}

class Admin extends User {

    StoreCTL mStoreCTL;
    BrandCTL mBrandCTL;

    public Admin() {
//        mBrandCTL = new BrandCTL();
        mStoreCTL = new StoreCTL();
    }
}
