package Alpinists;

import Alpinists.Alpinist;
public class Group {
    private boolean isGroupOpen;
    private Alpinists.Alpinist[] group;
    private String MountainName;

    public Group(boolean isGroupOpen, Alpinist[] group, String mountainName) {
        this.isGroupOpen = isGroupOpen;
        this.group = group;
        MountainName = mountainName;
    }
    public void addGroup(){

    }
}

