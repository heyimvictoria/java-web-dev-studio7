package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        CD cd = new CD("Bratz Soundtrack", 700, "CD-R", 350);
        DVD dvd = new DVD("The Godfather II", 4700, "DVD-R", 1450);

        cd.spinDisc();
        dvd.spinDisc();

        cd.readData();
        dvd.readData();

        System.out.println(cd.writeData(275));
        System.out.println(dvd.writeData(8000));

        System.out.println(cd.diskInfo());
        System.out.println(dvd.diskInfo());
    }
}
