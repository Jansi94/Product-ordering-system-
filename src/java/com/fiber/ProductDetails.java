/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fiber;

/**
 *
 * @author ADMIN
 */
public class ProductDetails {
    int pcode,price;
    String pname;

    public int getPcode() {
        return pcode;
    }

    public void setPcode(int pcode) {
        this.pcode = pcode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public ProductDetails(int price, String pname) {
        this.price = price;
        this.pname = pname;
    }
    
    ProductDetails()
    {
        
    }
    
}
