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
public class Trapez extends FiguraPlaska {

    private double a;
    private double b;
    private double c;
    private double d;
    private double h;

    public Trapez(double a, double b,double c,double d,double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    
    public double getD() {
        return d;
    }

    public double getH() {
        return h;
    }

    public void setA(double a) {
        if (a < 0) {
            System.out.println("Liczba ujemna");
        } else {
            this.a = a;
        }
    }

    public void setB(double b) {
        if (b < 0) {
            System.out.println("Liczba ujemna");
        } else {
            this.b = b;
        }
    }

    public void setC(double c) {
        if (c < 0) {
            System.out.println("Liczba ujemna");
        } else {
            this.c = c;
        }
    }
    
    public void setD(double d) {
        if (d < 0) {
            System.out.println("Liczba ujemna");
        } else {
            this.d = d;
        }
    }

    public void setH(double h) {
        if (h < 0) {
            System.out.println("Liczba ujemna");
        } else {
            this.h = h;
        }
    }

    @Override
    public double ObliczObwod() {
        double wynik = a+b+c+d;
        wynik*=100;
        wynik = Math.round(wynik);
        wynik/=100;
        return wynik;
    }

    @Override
    public double ObliczPole() {
        double wynik = ((a + b) * h) / 2;
        wynik*=100;
        wynik = Math.round(wynik);
        wynik/=100;
        return wynik;
    }

    @Override
    public String toString() {
        return super.toString() + " Pole trapeza: " + ObliczPole() + " Obwód trapeza: " + ObliczObwod();
    }
}
