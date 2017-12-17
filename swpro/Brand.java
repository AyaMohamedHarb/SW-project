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
public class Brand {

    String name;
    int brandCounter;
    ArrayList<Product> arrProducts;
    ProductCTL mProductCTL;
    BrandCTL mBrandCTL;

    public Brand() {
        name = "";
        brandCounter=0;
        
//        mProductCTL = new ProductCTL();
        arrProducts = new ArrayList<Product>();
    }

    public void set_brand() {
        Scanner s = new Scanner(System.in);
        System.out.println("enter brand name: ");
        this.name = s.nextLine();
        mBrandCTL.arrBrand.add(this);
    }

    public void get_brand(String n) {
        Brand temp = new Brand();
        for (int i = 0; i < mBrandCTL.arrBrand.size(); i++) {
            temp = mBrandCTL.arrBrand.get(i);
            if (temp.name == n) {
                System.out.println("brand name: "+ temp.name);
                for(int j=0;j<arrProducts.size();j++){
                    Product pro= new Product();
                    pro=arrProducts.get(i);
                    pro.get_product(pro.name);
                }
            }
        }
    }

    public void delete_brand(String n) {
        Brand temp = new Brand();
        for (int i = 0; i < mBrandCTL.arrBrand.size(); i++) {
            temp = mBrandCTL.arrBrand.get(i);
            if (temp.name == n) {
                mBrandCTL.arrBrand.remove(temp);
            }
        }
    }

    public void update_brand(String n) {
        Brand temp = new Brand();
        for (int i = 0; i < mBrandCTL.arrBrand.size(); i++) {
            temp = mBrandCTL.arrBrand.get(i);
            if (temp.name == n) {
                temp.set_brand();
            }
        }
        
    }

}
