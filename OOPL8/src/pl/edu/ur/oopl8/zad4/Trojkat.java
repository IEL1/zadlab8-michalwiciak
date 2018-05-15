/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl8.zad4;

/**
 *
 * @author MICHAL
 */
public class Trojkat extends FiguraPlaska {

    private double a;
    private double b;
    private double c;
    private double h;

    public Trojkat(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public double getH() {
        return h;
    }
    
    public void setH(double h) {
        if (h < 0) {
            System.out.println("Liczba ujemna");
        } else {
            this.h = h;
        }
    }    

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (a < 0) {
            System.out.println("Liczba ujemna");
        } else {
            this.a = a;
        }
    }
    
    public double getB() {
        return b;
    }

    public void setB(double b) {
        if (b < 0) {
            System.out.println("Liczba ujemna");
        } else {
            this.b = b;
        }
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        if (c < 0) {
            System.out.println("Liczba ujemna");
        } else {
            this.c = c;
        }
    }    


    @Override
    public double ObliczObwod() {
        double wynik = a+b+c;
        wynik*=100;
        wynik = Math.round(wynik);
        wynik/=100;
        return wynik;
    }

    @Override
    public double ObliczPole() {
        return (a * h) / 2;
    }

    @Override
    public String toString() {
        return super.toString() + " Pole trójkąta: " + ObliczPole() + " Obwód trókąta: " + ObliczObwod();
    }
}
