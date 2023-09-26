package day12.task4;

import day12.task4.*;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Bob Marley");
        members1.add("Cab Swonson");
        members1.add("Tom Farr");
        members1.add("Eddy Frost");
        members1.add("MelL Gibson");

        MusicBand band1 = new MusicBand("New Band", 2000, members1);


        List<String> members2 = new ArrayList<>();
        members2.add("Mick J");
        members2.add("Salamon T");
        members2.add("Klint I");
        members2.add("Dana W");
        members2.add("Jeff F");

        MusicBand band2 = new MusicBand("Old Band", 1997, members2);

        band1.printMembers();
        System.out.println();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        System.out.println();
        band2.printMembers();
    }
}
