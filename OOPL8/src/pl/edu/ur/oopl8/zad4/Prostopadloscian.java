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
public class Prostopadloscian extends FiguraPrzestrzenna {

    private double a;
    private double b;
    private double c;

    public Prostopadloscian(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    @Override
    public double ObliczObjetosc() {
        double wynik = a * b * c;
        wynik*=100;
        wynik = Math.round(wynik);
        wynik/=100;
        return wynik;
    }

    @Override
    public double ObliczPole() {
        double wynik = (2 * a * b) + (2 * a * c) + (2 * b * c);
        wynik*=100;
        wynik = Math.round(wynik);
        wynik/=100;
        return wynik;
    }

    @Override
    public String toString() {
        return super.toString() + " Pole prostopadłościanu: " + ObliczPole() + " Objętość prostopadłościanu: " + ObliczObjetosc();
    }

}
