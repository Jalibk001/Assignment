/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment3.jalib.dao;
import com.assignment3.jalib.assignment.EnterUser;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author Jalib
 */
public class Userdao {
    public Session currSession = null;
	public Userdao(){
		HibernateUtil.createSessionFactory();
		currSession=HibernateUtil.getSessionFactory().openSession();  
	}
	public void finalize(){
		currSession.close();
	}
        public void save(String name,String pass)
        {
            Transaction t=currSession.beginTransaction();  
      			currSession.persist(name);
                        currSession.persist(pass);
		
      		t.commit(); 

        }

}
