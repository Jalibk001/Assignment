/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment3.jalib.assignment;

/**
 *
 * @author Jalib
 */
public class EnterUser {
    String name;
    String pass;
    EnterUser()
    {}
    EnterUser(String name,String pass)
    {
        this.name=name;
        this.pass=pass;
    }
    public boolean check(String name,String pass)
    {
        return this.name!=null;
    }
}
