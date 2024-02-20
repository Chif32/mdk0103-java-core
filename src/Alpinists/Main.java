

package Alpinists;


import Alpinists.Alpinist;
import Alpinists.Mountain;

public class Main {
    public static void main(String[] args) {
        Alpinist[] alpinists = new Alpinist[3];
        alpinists[0] = new Alpinist("Egor", 20, "Kolpino");
        alpinists[1] = new Alpinist("Max", 18, "Mezhda");
        alpinists[2] = new Alpinist("Vasya", 40, "Kup4aga");

        Mountain everest = new Mountain("Everest", "Nepal", 8848.86);

        System.out.println(everest);
    }
}