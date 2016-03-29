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
public class Order {
    int id,orderQty,orderPcode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    String uname;

   

    public int getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
    }

    public int getOrderPcode() {
        return orderPcode;
    }

    public void setOrderPcode(int orderPcode) {
        this.orderPcode = orderPcode;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Order(String uname,int orderPcode, int orderQty) {
        this.orderQty = orderQty;
        this.orderPcode = orderPcode;
        this.uname = uname;
    }
    
    public Order()
    {
        
    }
    
    
}
