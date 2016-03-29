/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fiber;

import static java.lang.System.out;
import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


/**
 *
 * @author ADMIN
 */
public class LoginManager {
    SessionFactory factory;
    ServiceRegistry sr;
    public LoginManager()
    {
        try
        {
            Configuration cfg = new Configuration();
            cfg.configure("hibernate.cfg.xml");
            sr= new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
            factory=cfg.buildSessionFactory(sr);
            
            
                   
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void addLogin(String uname,String pwd,String address)
    {
        Session session=null;
        Transaction txn=null;
        
        try
        {
            session=factory.openSession();
            txn=session.beginTransaction();
            
            Login log= new Login(uname,pwd,address);
            session.save(log);
            txn.commit();
            //out.println("Registered Sucessfully");
            //response.setHeader("Refresh", "5; URL=http://localhost:8082/Product/loginpage.jsp");
            //out.println("Please Login to continue");
        }
        catch(Exception e)
        {
            if(txn!=null)
                txn.rollback();
            e.printStackTrace();
            
           
        }
        
        finally
        {
            session.close();
            
        }
    }
    
    public void saveOrder(String uname,int orderPcode,int orderQty)
    {
        Session session=null;
        Transaction txn=null;
        
        try
        {
            session=factory.openSession();
            txn=session.beginTransaction();
            
             Order o= new Order(uname,orderPcode,orderQty);
            session.save(o);
            txn.commit();
            //out.println("Registered Sucessfully");
            //response.setHeader("Refresh", "5; URL=http://localhost:8082/Product/loginpage.jsp");
            //out.println("Please Login to continue");
        }
        catch(Exception e)
        {
            if(txn!=null)
                txn.rollback();
            e.printStackTrace();
            
           
        }
        
        finally
        {
            session.close();
            
        }
    }
    
    
     public List returnProduct()
    {
        Session session=null;
        Transaction tx=null;
        List list=null;
        try
        {
            session=factory.openSession();
            tx=session.beginTransaction();
            String hql="FROM ProductDetails";
            Query query=session.createQuery(hql);
            list=query.list();
            tx.commit();
        }
        catch(HibernateException e)
        {
            if(tx!=null)
                tx.rollback();
            e.printStackTrace();
        }
        finally
        {
            session.close();
            return list;
        }
    }


    
     public boolean checkUser(String uname,String password)
    {
        Session session =null;
        Transaction trans=null;
        int flag=0;
        try

        {
            session= factory.openSession();
            trans=session.beginTransaction();
            
            String hql="FROM Login WHERE uname ='"+uname+"' AND pwd='"+password+"'";
            Query query=session.createQuery(hql);
            List list=query.list();
            if(!list.isEmpty())
                flag=1;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            session.close();
            return flag==1;
            
        }
        
    }
      public boolean isExist(String uname,String pwd){
        Session session=null;
        Transaction tx=null;
        int flag=0;
        try{
            session=factory.openSession();
            tx=session.beginTransaction();
            String hql="FROM Login WHERE uname='"+uname+"'  AND pwd='"+pwd+"'";
            Query query=session.createQuery(hql);
            List list=query.list();
            
            
            if(!list.isEmpty())
                flag=1;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally{
            session.close();
            return flag==1;
        }
    }
   


    
}
