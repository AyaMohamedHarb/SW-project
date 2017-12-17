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
public class voucherCard {
    int ID;
    double discount;
    Store mStore;
    public voucherCard(){
        ID=0;
        discount=0.0;
        
    }
    public void set_voucher(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the ID of voucher card: ");
        this.ID=s.nextInt();
        s.nextLine();
        System.out.println("Enter the amount of the discount: ");
        this.discount=s.nextDouble();
        
    }
    public void get_voucher(int ID){
        voucherCard temp =new voucherCard();
        for(int i=0;i<mStore.arrVoucher.size();i++){
            temp=mStore.arrVoucher.get(i);
            if(temp.ID == ID){
                System.out.println("Voucher ID: "+temp.ID);
                System.out.println("Its amount is: "+temp.discount);
            }
        }
        
    }
    public void delete_voucher(int id){
        voucherCard temp =new voucherCard();
        for(int i=0;i<mStore.arrVoucher.size();i++){
            temp=mStore.arrVoucher.get(i);
            if(temp.ID == id){
                mStore.arrVoucher.remove(temp);
            }
        }
    }
   public void update_voucher(int id){
       voucherCard temp =new voucherCard();
        for(int i=0;i<mStore.arrVoucher.size();i++){
            temp=mStore.arrVoucher.get(i);
            if(temp.ID == id){
                temp.set_voucher();
            }
        }
   } 
}
