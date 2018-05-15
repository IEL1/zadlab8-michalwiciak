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
public class Szescian extends FiguraPrzestrzenna {

    private double a;

    public Szescian(double a) {
        this.a = a;
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

    @Override
    public double ObliczObjetosc() {
        double wynik = a*a*a;
        wynik*=100;
        wynik = Math.round(wynik);
        wynik/=100;
        return wynik;
    }

    @Override
    public double ObliczPole() {
        double wynik = 6*a*a;
        wynik*=100;
        wynik = Math.round(wynik);
        wynik/=100;
        return wynik;
    }

    @Override
    public String toString() {
        return super.toString() + " Pole sześcianu: " + ObliczPole() + " Objętość sześcianu: " + ObliczObjetosc();
    }

}
