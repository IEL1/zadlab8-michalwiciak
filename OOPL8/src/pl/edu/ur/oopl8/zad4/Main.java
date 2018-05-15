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
public class Main {

    public static void main(String[] args) {

        FiguraGeometryczna[] figury = new FiguraGeometryczna[15];

        figury[0] = new Kwadrat(3.15);
        figury[1] = new Prostokat(2.4, 6.7);
        figury[2] = new Trojkat(2, 3, 4, 5);
        figury[3] = new Trapez(2, 4, 6, 8, 10);
        figury[4] = new Rownoleglobok(3,4);
        figury[5] = new Romb(3, 6);
        figury[6] = new Kolo(7);
        figury[7] = new Szescian(8);
        figury[8] = new Prostopadloscian(3, 6, 4);
        figury[9] = new Kula(4);
        figury[10] = new Walec(5, 6);
        figury[11] = new Stozek(5 , 2 ,6);
        figury[12] = new Kwadrat(4.6);
        figury[13] = new Prostokat(2.9, 6.1);
        figury[14] = new Trojkat(5, 3, 6, 6);

        int i = 0;
        while (i < figury.length) {
            System.out.println(figury[i].toString());
            i++;
        }
        /*Program najpierw wyświetla metody toString odpowiednio dla każdej figury w zależności czy jest figurą płaską czy przestrzenną(dziedziczy po jednej lub drugiej).
        Następnie wyświetla obliczone pole i obwód lub objętość z przesłoniętych metod abstrakcyjnych. Zgodnie z pętlą while, wyświetlanych jest 15 utworzonych obiektów, tyle ile jest elementów tablicy.
        Program rozpoznaje, którą metodę toString dla której figury ma wywowołać.
        */
    }
}
