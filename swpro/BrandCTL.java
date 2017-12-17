/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swpro;

import java.util.ArrayList;

/**
 *
 * @author Andalus
 */
public class BrandCTL {
    //Brand mBrand;
    BrandUI mBrandUI;
    ArrayList<String> Suggestion;
    ArrayList<Brand> arrBrand;
    public BrandCTL() {
//        mBrand = new Brand();
//        mBrandUI = new BrandUI();
        arrBrand = new ArrayList<Brand>();
        Suggestion= new ArrayList<String>();
    }
    public void manage_brand(String action, String name){
        Brand mBrand = new Brand();
        switch(action){
            case "update":
                mBrand.update_brand(name);
                break;
            case "delete":
                mBrand.delete_brand(name);
        }
    }
    public void suggestBrand(String temp){
        Suggestion.add(temp);
    
    }
    public void addBrand(String s, String name) {

        switch (s) {
            case "accept":
                accept(name);
                break;
            case "reject":
                reject(name);
                break;
        }
    }

    public void reject(String n) {
        for (int i = 0; i < Suggestion.size(); i++) {
            if (Suggestion.get(i) == n) {
                Suggestion.remove(i);
            }
        }
    }

    public void accept(String n) {
        Brand mBrand = new Brand();
        System.out.println("Enter information of " + n);
        mBrand.set_brand();
        arrBrand.add(mBrand);
    }
}
