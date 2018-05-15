/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl8;

/**
 *
 * @author MICHAL
 */
public class Book extends Product{
    public Book(String name, double price, String describe) {
        super(name, price, describe);
    }

    @Override
    public void buy() {
        System.out.println(
                "I bought a book!");
    }

    @Override
    public void showInfo() {
        System.out.println(
                "Price:" + getPrice()
                + " name:" + getName()
                + " describe:" + getDescribe()
        );
    }
    
}
