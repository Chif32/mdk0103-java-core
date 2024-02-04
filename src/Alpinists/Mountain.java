package Alpinists;
import Alpinists.Alpinist;

public class Mountain {
    private String name;
    private String country;
    private double height;
    private boolean isGroupOpen;
    private Alpinist[] group;

    public Mountain(String name, String country, double height, boolean isGroupOpen, Alpinist[] alpinists) {
        this.name = name;
        this.country = country;
        this.height = height;
        this.isGroupOpen = isGroupOpen;
        this.group = alpinists;
    }

    public void addToGroup(Alpinist alpinist) {
        if (isGroupOpen) {
            Alpinist[] newGroup = new Alpinist[group.length + 1];
            System.arraycopy(group, 0, newGroup, 0, group.length);
            newGroup[group.length] = alpinist;
            group = newGroup;
        } else {
            System.out.println("Набор в группу прекращен!");
        }
    }
}