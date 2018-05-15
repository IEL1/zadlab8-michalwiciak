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
public class Tab {

    public static void tab() {
        Product[] product = new Product[10];

        product[0] = new Book("book1", 18.5, "aaa");
        product[1] = new Chocolate("chocolate1", 10.3, "bbb");
        product[2] = new Book("book2", 19.2, "ccc");
        product[3] = new Pen("pen1", 3.2, "ddd");
        product[4] = new Jam("jam1", 8.4, "eee");
        product[5] = new Aspirin("aspirin1", 10.2, "fff");
        product[6] = new Jam("jam2", 9.5, "ggg");
        product[7] = new Chocolate("chocolate2", 5.5, "hhh");
        product[8] = new Pen("pen2", 2.8, "iii");
        product[9] = new Tractor("tractor1", 6220.5, "jjj");

        for (int i = 0; i < 10; i++) {
            product[i].buy();
            product[i].showInfo();
        }
    }

    public static void main(String[] args) {
        tab();
        /*Program  najpierw wypisuje wyniki metod buy i showinfo z tym, że dzięki dziedziczeniu z klasy abstrakcyjnej do zwykłych klas i przesłonięciu metod abstrakcyjnych są to już zwykłe, skonkretyzowane metody.
        W ten sposób można było utworzyć spersonalizowane metody pod kątem konkretnych produktów oraz utworzyć ich obiekty i pracować na nich.
        Wyświetlane wyniki są pobierane z tych, które były wpisywane przy dodawaniu obiektów klas różnych produktów do tablicy.
        */
    }
}
