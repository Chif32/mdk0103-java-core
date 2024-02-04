

package Alpinists;


import Alpinists.Alpinist;
import Alpinists.Mountain;

public class Main {
    public static void main(String[] args) {
        Alpinist[] alpinists = new Alpinist[3];
        alpinists[0] = new Alpinist("Egor", 20, "Patrashitel");
        alpinists[1] = new Alpinist("Max", 18, "Desolator");
        alpinists[2] = new Alpinist("Vasya", 40, "Gindenblat");

        Mountain everest = new Mountain("Everest", "Nepal", 8848.86, false, alpinists);

        System.out.println(everest);
    }
}